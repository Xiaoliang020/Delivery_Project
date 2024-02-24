package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Scheduled tasks class
 */
@Component
@Slf4j
public class MyTask {

//    /**
//     *  Triggered every 5s
//     */
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void executeTask() {
//        log.info("Scheduled task start executing: {}", new Date());
//    }

}
