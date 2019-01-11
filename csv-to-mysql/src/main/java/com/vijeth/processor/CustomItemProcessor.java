package com.vijeth.processor;

import com.vijeth.model.Report;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;


@Component
public class CustomItemProcessor implements ItemProcessor<Report, Report> {
    @Override
    public Report process(Report report) throws Exception {
        System.out.println("Processing the report: "+report);
        return report;
    }
}
