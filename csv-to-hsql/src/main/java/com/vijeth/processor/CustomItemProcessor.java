package com.vijeth.processor;

import com.vijeth.model.Report;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;


@Component
public class CustomItemProcessor implements ItemProcessor<Report, Report> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomItemProcessor.class);

    @Override
    public Report process(Report report) throws Exception {
        LOGGER.info("Processing the report: [{}]", report);
        return report;
    }
}
