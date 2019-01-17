package com.vijeth.writer;

import com.vijeth.model.Report;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsoleItemWriter implements ItemWriter<Report> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsoleItemWriter.class);

    @Override
    public void write(List<? extends Report> reports) throws Exception {
        LOGGER.info("Batch-size of reports: [{}]", reports.size());
        for(Report item : reports){
            LOGGER.info("[{}]", item);
        }
    }
}
