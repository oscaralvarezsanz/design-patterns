package com.best.practices.structural.adapter.problem;

public class StockMarketApp {

    public void showStockData() {
        StockDataProvider provider = new StockDataProvider();
        XmlData xmlData = provider.downloadStockData();
        
        AnalyticsLibrary analytics = new AnalyticsLibrary();
        
        // CODE SMELL: The app wants to use the AnalyticsLibrary, but it only accepts JsonData.
        // The business logic is now polluted with data format conversion logic.
        System.out.println("Converting XML to JSON manually inside the business logic...");
        String xml = xmlData.getXml();
        String jsonStr = xml.replace("<stock>", "{")
                            .replace("</stock>", "}")
                            .replace("<name>", "\"name\": \"")
                            .replace("</name>", "\", ")
                            .replace("<price>", "\"price\": ")
                            .replace("</price>", "");
                         
        JsonData jsonData = new JsonData(jsonStr);
        
        analytics.displayData(jsonData);
    }
}
