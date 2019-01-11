package com.vijeth.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.vijeth.model.Report;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


public class ReportFieldSetMapper implements FieldSetMapper<Report> {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public Report mapFieldSet(FieldSet fieldSet) throws BindException {
        Report report = new Report();
        report.setId(fieldSet.readInt("id"));
        report.setSales(fieldSet.readBigDecimal("sales"));
        report.setQty(fieldSet.readInt("qty"));
        report.setStaffName(fieldSet.readString("staffName"));

        String date = fieldSet.readString(4);
        try {
            report.setDate(dateFormat.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return report;
    }
}
