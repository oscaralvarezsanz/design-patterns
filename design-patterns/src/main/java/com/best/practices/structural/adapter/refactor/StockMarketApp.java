package com.best.practices.structural.adapter.refactor;

public class StockMarketApp {

    public void showStockData() {
        StockDataProvider provider = new StockDataProvider();
        XmlData xmlData = provider.downloadStockData();
        
        AnalyticsLibrary analytics = new AnalyticsLibrary();
        
        XmlToJsonAdapter xmlToJsonAdapter = new XmlToJsonAdapter(xmlData);
        
        analytics.displayData(xmlToJsonAdapter);
    }
}
