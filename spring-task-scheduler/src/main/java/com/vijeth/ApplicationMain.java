package com.vijeth;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) {

        String[] springConfig  =
                {
                        "jobs/csv-to-console-job.xml",
                        "config/context.xml"
                };

        new ClassPathXmlApplicationContext(springConfig);

    }
}
