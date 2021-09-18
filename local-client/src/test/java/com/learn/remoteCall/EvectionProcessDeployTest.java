package com.learn.remoteCall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EvectionProcessDeployTest {

    @Autowired
    private EvectionProcessDeployRemote evectionProcessDeployRemote;

    @Test
    public void getEvectionProDeployResult(){
        evectionProcessDeployRemote.getEvectionProDeployResult();
    }

    @Test
    public void getEvectionProStratRes(){
        evectionProcessDeployRemote.getEvectionProStartResult();
    }

    @Test
    public void findPersonTaskList(){
        evectionProcessDeployRemote.findPersonTaskList();
    }

    @Test
    public void completeTaskByTaskIds(){
        List<String> taskIds = evectionProcessDeployRemote.findPersonTaskList();
        
        evectionProcessDeployRemote.completeTaskByTaskIds(taskIds);
    }
}
