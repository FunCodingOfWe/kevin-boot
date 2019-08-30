package com.kevin.common.config;

import com.kevin.common.job.SampleJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kevin
 * @Date: 2019/8/30 10:35
 */
@Configuration
public class SampleSchedulerConfig {

    @Bean
    public JobDetail sampleJobDetail(){
        return JobBuilder.newJob(SampleJob.class)
                .withIdentity("sampleJob")
                .usingJobData("name","kevin-boot")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger sampleJobTrigger(){
        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder
                .simpleSchedule()
                .withIntervalInSeconds(20)
                .repeatForever();

        return TriggerBuilder.newTrigger()
                .forJob(sampleJobDetail())
                .withIdentity("sampleTrigger")
                .withSchedule(simpleScheduleBuilder)
                .build();
    }
}
