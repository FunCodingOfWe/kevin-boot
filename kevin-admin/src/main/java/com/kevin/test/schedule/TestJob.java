package com.kevin.test.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestJob {

    @Value("${name}")
    private  String name;
//    @Scheduled(fixedDelay = 5000, initialDelay = 2000)
//    private void execute() {
//        log.info(">>>>>>>>>>>> Scheduled is run !"+name);
//    }
}
