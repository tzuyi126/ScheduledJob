package com.tychang.practice.cron;

import com.tychang.practice.utils.TimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CronService {
    private static final Logger log = LoggerFactory.getLogger(CronService.class);

    @Scheduled(fixedDelay = 5000 )
    public void scheduledFixedDelay() throws Exception {
        log.info("Fixed delay: {}", TimeFormatter.format(LocalDateTime.now()));
        Thread.sleep(5000);
    }

    @Scheduled(fixedRate = 3000)
    public void scheduledFixedRate() throws Exception {
        log.info("Fixed rate: {}", TimeFormatter.format(LocalDateTime.now()));
        Thread.sleep(4000);
    }

    @Scheduled(fixedRate = 1000, initialDelay = 10000)
    public void scheduledFixedRateWithInitialDelay() throws Exception {
        log.info("Fixed rate with 10s initial delay: {}", TimeFormatter.format(LocalDateTime.now()));
        Thread.sleep(2000);
    }

    @Scheduled(cron = "${cron.scheduled.time}")
    public void scheduledCron() throws Exception {
        log.info("Cron: {}", TimeFormatter.format(LocalDateTime.now()));
    }
}
