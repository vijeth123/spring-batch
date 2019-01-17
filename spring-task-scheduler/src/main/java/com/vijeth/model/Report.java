package com.vijeth.model;

import org.springframework.stereotype.Component;

@Component
public class Report {
    private String updatedDate;
    private String Impressions;
    private String Clicks;
    private String Earning;

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getImpressions() {
        return Impressions;
    }

    public void setImpressions(String impressions) {
        Impressions = impressions;
    }

    public String getClicks() {
        return Clicks;
    }

    public void setClicks(String clicks) {
        Clicks = clicks;
    }

    public String getEarning() {
        return Earning;
    }

    public void setEarning(String earning) {
        Earning = earning;
    }

    @Override
    public String toString() {
        return "Report{" +
                "updatedDate='" + updatedDate + '\'' +
                ", Impressions='" + Impressions + '\'' +
                ", Clicks='" + Clicks + '\'' +
                ", Earning='" + Earning + '\'' +
                '}';
    }
}

