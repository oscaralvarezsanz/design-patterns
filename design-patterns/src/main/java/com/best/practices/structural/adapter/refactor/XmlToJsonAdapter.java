package com.best.practices.structural.adapter.refactor;

public class XmlToJsonAdapter extends JsonData {
    private final XmlData xmlData;

    public XmlToJsonAdapter(XmlData xmlData) {
        super(null); 
        this.xmlData = xmlData;
    }

    @Override
    public String getJson() {
        if (xmlData.getXml() == null) return "{}";

        return xmlData.getXml().replace("<stock>", "{")
                  .replace("</stock>", "}")
                  .replace("<name>", "\"name\": \"")
                  .replace("</name>", "\", ")
                  .replace("<price>", "\"price\": ")
                  .replace("</price>", "");
    }
}