package com.vijeth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationMain.class);

    public static void main(String[] args) {

        String[] springConfig  =
                {
                        "jobs/csv-to-xml-job.xml"
                };

        ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("CSV_TO_XML_JOB");

        try {
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            LOGGER.info("Exit Status : [{}]", execution.getStatus());

        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("Done");
    }
}
