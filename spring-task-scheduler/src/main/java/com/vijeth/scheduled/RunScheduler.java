package com.vijeth.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class RunScheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RunScheduler.class);

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    @Scheduled(fixedDelayString = "5000")
    public void run() throws Exception {
        JobParameters jobParameters = new JobParametersBuilder()
                                            .addString("date", LocalDateTime.now().toString())
                                            .toJobParameters();

        LOGGER.info("jobParameters: [{}]", jobParameters);
        JobExecution jobExecution = jobLauncher.run(job, jobParameters);
        LOGGER.info("Exit status: [{}]", jobExecution.getStatus());
    }
}
