package com.vijeth.util;

import com.vijeth.model.Report;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class ReportFieldSetMapper implements FieldSetMapper<Report> {
    @Override
    public Report mapFieldSet(FieldSet fieldSet) throws BindException {
        Report report = new Report();
        report.setUpdatedDate(fieldSet.readString("Updated_Date"));
        report.setImpressions(fieldSet.readString("Impressions"));
        report.setClicks(fieldSet.readString("Clicks"));
        report.setEarning(fieldSet.readString("Earning"));
        return report;
    }
}
