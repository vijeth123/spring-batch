package com.vijeth.util;

import org.springframework.batch.item.file.LineCallbackHandler;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomLineCallbackHandler implements LineCallbackHandler {
    @Autowired
    private DelimitedLineTokenizer lineTokenizer;

    @Override
    public void handleLine(String line) {
        this.lineTokenizer.setNames(line.split(","));
    }
}
