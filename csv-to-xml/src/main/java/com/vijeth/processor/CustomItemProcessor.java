package com.vijeth.processor;

import com.vijeth.model.Report;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;


@Component
public class CustomItemProcessor implements ItemProcessor<Report, Report> {
    @Override
    public Report process(Report report) throws Exception {
        System.out.println("Processing the report: "+report);
        if(report.getQty() < 500){
            System.out.println("Skipping this report: "+report);
            return null;
        }
        return report;
    }
}
