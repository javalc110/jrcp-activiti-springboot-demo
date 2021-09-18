package com.learn.callback;

import grpc.test.completeTaskRes;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component
public class CompleteTaskCallback {
    
    public void callbackInstance(completeTaskRes completeTaskRes){
        if (completeTaskRes.getFlag()){
            System.out.println("taskId: " + completeTaskRes.getTaskId() + " 完成任务");
        } else {
            System.out.println("taskId: " + completeTaskRes.getTaskId() + " 未完成任务");
        }

    }
}
