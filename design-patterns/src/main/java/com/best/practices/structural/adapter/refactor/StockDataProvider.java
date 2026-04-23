package com.best.practices.structural.adapter.refactor;

public class StockDataProvider {
    public XmlData downloadStockData() {
        System.out.println("Downloading stock data from provider...");
        return new XmlData("<stock><name>AAPL</name><price>150</price></stock>");
    }
}
