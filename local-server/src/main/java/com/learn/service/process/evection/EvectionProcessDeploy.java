package com.learn.service.process.evection;

import com.learn.common.constants.DeployRepositoryConstants;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvectionProcessDeploy {

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    // 出差流程部署
    public Deployment evectionProcessDeploy(){
        return repositoryService.createDeployment()
                .name(DeployRepositoryConstants.EVECTION_PROCESS_NAME)
                .addClasspathResource(DeployRepositoryConstants.BPMN_URL + DeployRepositoryConstants.EVECTION_PROCESS_BPMN)
                .addClasspathResource(DeployRepositoryConstants.BPMN_URL + DeployRepositoryConstants.EVECTION_PROCESS_PNG)
                .deploy();
    }

    // 出差流程开启
    public ProcessInstance evectionProcessStart(String evectionProcessKey){
         return runtimeService.startProcessInstanceByKey(evectionProcessKey);
    }

    // 查询个人待执行的任务
    public List<Task> findPersonTaskList(String definitionKey, String assingee){
        return taskService.createTaskQuery()
                .taskAssignee(assingee)
                .processDefinitionKey(definitionKey)
                .list();
    }

    // 完成任务
    public boolean completeTaskByTaskIds(String taskId){
        boolean flag = true;
       try {
           taskService.complete(taskId);
       } catch (RuntimeException r){
           flag = false;
           r.printStackTrace();
       }
       return flag;
    }
}
