package com.learn.grpcImp;

import com.learn.service.process.evection.EvectionProcessDeploy;
import grpc.test.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@GrpcService
public class EvectionDeployGrpcImpl extends TestServiceGrpc.TestServiceImplBase{
    @Autowired
    private EvectionProcessDeploy evectionProcessDeploy;

    // 出差流程部署
    public void evectionDeploy(evectionDeployRequest request, StreamObserver<evectionDeployResult> responseObserver) {
        Deployment deployment = evectionProcessDeploy.evectionProcessDeploy();

        System.out.println("服务端发送前的流程部署id: " + deployment.getId());
        System.out.println("服务端发送前的流程部署名称: " + deployment.getName());
        responseObserver.onNext(evectionDeployResult
                .newBuilder()
                .setEvectionDeployId(deployment.getId())
                .setEvectionDeployName(deployment.getName())
                .build());
        responseObserver.onCompleted(); // 处理完数据完后一定要记得 completed， 不然不会将数据发送给客户端。
    }

    // 开启出差流程
    public void evectionProcessStart(evectionProcessStartReq request, StreamObserver<evectionProcessStartRes> responseObserver) {
        ProcessInstance processInstance = evectionProcessDeploy.evectionProcessStart(request.getEvectionDefinitionKey());
        System.out.println("服务端发送前的流程定义ID：" + processInstance.getProcessDefinitionId());
        System.out.println("服务端发送前的流程实例ID：" + processInstance.getId());
        System.out.println("服务端发送前的当前活动ID：" + processInstance.getActivityId());
        String activityId = fieldNullConvert(processInstance.getActivityId());
        responseObserver.onNext(evectionProcessStartRes
                .newBuilder()
                .setEvectionProcessDefinitionId(processInstance.getProcessDefinitionId())
                .setProcessInstanceId(processInstance.getId())
                .setActivityId(activityId)
                .build());
        responseObserver.onCompleted();
    }

    // 查询个人待执行的任务
    public void findEvectionPersonTaskList(findEvectionPersonTaskListReq request, StreamObserver<findEvectionPersonTaskListRes> responseObserver) {
        List<Task> taskList = evectionProcessDeploy.findPersonTaskList(request.getDefinitionKey(), request.getAssignee());
        for (Task task : taskList) {
            System.out.println("----------------------------");
            System.out.println("服务端发送前的流程实例ID：" + task.getProcessInstanceId());
            System.out.println("服务端发送前的任务ID：" +task.getId());
            System.out.println("服务端发送前的任务负责人：" + task.getAssignee());
            System.out.println("服务端发送前的任务名称：" + task.getName());
            responseObserver.onNext(findEvectionPersonTaskListRes
                    .newBuilder()
                    .setProcessInstanceId(task.getProcessInstanceId())
                    .setTaskId(task.getId())
                    .setAssignee(task.getAssignee())
                    .setTaskName(task.getName())
                    .build());
        }
        responseObserver.onCompleted();
    }

    public StreamObserver<completeTaskReq> completeTaskByTaskIds(StreamObserver<completeTaskRes> responseObserver) {
        return new StreamObserver<completeTaskReq>() {
            @Override
            public void onNext(completeTaskReq value) {
                boolean flag = evectionProcessDeploy.completeTaskByTaskIds(value.getTaskId());
                System.out.println("服务端发送的 flag: " + flag);
                System.out.println("服务端接收到的 taskId: " + value.getTaskId());
                responseObserver.onNext(completeTaskRes
                        .newBuilder()
                        .setTaskId(value.getTaskId())
                        .setFlag(flag)
                        .build());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }


    public String fieldNullConvert(String field){
        if (field == null)
            field = "";
        return field;
    }
}
