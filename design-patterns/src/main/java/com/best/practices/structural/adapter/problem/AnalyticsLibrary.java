package com.best.practices.structural.adapter.problem;

public class AnalyticsLibrary {
    public void displayData(JsonData jsonData) {
        System.out.println("Processing and displaying JSON data: ");
        System.out.println(jsonData.getJson());
    }
}
