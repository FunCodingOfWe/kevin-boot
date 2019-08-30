package com.kevin.common.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: kevin
 * @Date: 2019/8/30 15:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaskTest {
    @Autowired
    private Task task;

    @Test
    public void test() throws Exception {

        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();
        //Thread.currentThread().join();
    }

}