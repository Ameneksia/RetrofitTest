package com.example.sergei.retrofittest;

import java.util.HashMap;
import java.util.Map;

public class TestTime {

    private String time;
    private Integer millisecondsSinceEpoch;
    private String date;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMillisecondsSinceEpoch() {
        return millisecondsSinceEpoch;
    }

    public void setMillisecondsSinceEpoch(Integer millisecondsSinceEpoch) {
        this.millisecondsSinceEpoch = millisecondsSinceEpoch;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}