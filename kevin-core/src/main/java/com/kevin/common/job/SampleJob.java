package com.kevin.common.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @Author: kevin
 * @Date: 2019/8/30 10:31
 */
public class SampleJob extends QuartzJobBean {
    private  String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(String.format("Hello %s!", this.name));
    }
}
