package com.learn.remoteCall;

import com.learn.callback.CompleteTaskCallback;
import com.learn.common.ProcessDefinitionConstants;
import grpc.test.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Component
public class EvectionProcessDeployRemote {

    @GrpcClient("local-grpc-server")
    private TestServiceGrpc.TestServiceBlockingStub blockStub;

    @GrpcClient("local-grpc-server")
    private TestServiceGrpc.TestServiceStub stub;
    
    @Autowired
    private CompleteTaskCallback completeTaskCallback;

    // 远程调用获取出差流程部署信息
    public void getEvectionProDeployResult(){
        evectionDeployResult result = this.blockStub.evectionDeploy(evectionDeployRequest.getDefaultInstance());

        System.out.println("客户端接收到的流程部署id: " + result.getEvectionDeployId());
        System.out.println("客户端接收到的流程部署名称: " + result.getEvectionDeployName());
    }
    
    // 远程调用获取出差流程开始信息
    public void getEvectionProStartResult(){
        evectionProcessStartRes result = this.blockStub.evectionProcessStart(evectionProcessStartReq
                .newBuilder()
                .setEvectionDefinitionKey(ProcessDefinitionConstants.LEAVE_PROCESS_DEFINITION_KEY)
                .build());
        System.out.println("客户端接收到的流程定义ID：" + result.getEvectionProcessDefinitionId());
        System.out.println("客户端接收到的流程实例ID：" + result.getProcessInstanceId());
        System.out.println("客户端接收到的当前活动ID：" + result.getActivityId());
    }

    // 远程调用获取某个人某个流程的任务列表
    public List<String> findPersonTaskList(){
        List<String> taskIds = new ArrayList();
        Iterator<findEvectionPersonTaskListRes> result = this.blockStub.findEvectionPersonTaskList(findEvectionPersonTaskListReq
                .newBuilder()
                .setDefinitionKey(ProcessDefinitionConstants.LEAVE_PROCESS_DEFINITION_KEY)
                .setAssignee(ProcessDefinitionConstants.LEAVE_PROCESS_DEFINITION_MANAGER)
                .build());
        while (result.hasNext()){
            findEvectionPersonTaskListRes next = result.next();
            taskIds.add(next.getTaskId());
//            System.out.println("---------------------------");
//            System.out.println("客户端接收到的流程实例ID：" + next.getProcessInstanceId());
//            System.out.println("客户端接收到的任务ID：" + next.getTaskId());
//            System.out.println("客户端接收到的任务负责人：" + next.getAssignee());
//            System.out.println("客户端接收到的任务名称：" + next.getTaskName());
        }
        return taskIds;
    }

    // 远程调用 完成某些taskId的任务
    public void completeTaskByTaskIds(List<String> taskIds){
        this.getCompleteTaskByTaskIdsResult(completeTaskCallback,taskIds);
    }

    public void getCompleteTaskByTaskIdsResult(CompleteTaskCallback callback, List<String> taskIds){
        CountDownLatch countDownLatch = new CountDownLatch(1);
        StreamObserver<completeTaskRes> responseObserver = new StreamObserver<completeTaskRes>() {
            @Override
            public void onNext(completeTaskRes completeTaskRes) {
                System.out.println("服务端开始回调");
                callback.callbackInstance(completeTaskRes);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Complete call");
                countDownLatch.countDown();
            }
        };
        StreamObserver<completeTaskReq> requestObserver = stub.completeTaskByTaskIds(responseObserver);
        for (String taskId : taskIds) {
            System.out.println("客户端发送的 taskId: " + taskId);
            requestObserver.onNext(completeTaskReq.newBuilder().setTaskId(taskId).build());
        }
        // 双向流，客户端流 onNext，onCompleted 方法用的都是异步请求，无法保证谁先结束，所以需要加上CountDownLatch 来控制资源同步处理。
        requestObserver.onCompleted();

        try {
            //如果在规定时间内没有请求完
            if(!countDownLatch.await(100, TimeUnit.SECONDS)){
                System.out.println("未在规定时间内完成调用");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
