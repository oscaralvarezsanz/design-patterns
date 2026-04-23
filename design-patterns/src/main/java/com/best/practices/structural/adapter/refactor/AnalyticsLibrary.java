package com.best.practices.structural.adapter.refactor;

public class AnalyticsLibrary {
    public void displayData(JsonData jsonData) {
        System.out.println("Processing and displaying JSON data: ");
        System.out.println(jsonData.getJson());
    }
}
