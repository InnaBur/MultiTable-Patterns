package com.task2;

import com.task2.Factory.AscendingList;
import com.task2.Factory.DescendingList;
import com.task2.Factory.ListOfMultipliersFactory;
import com.task2.Strategy.NumberProcessor;

import java.util.List;
import java.util.Properties;

public class DataProcessing {

    Properties properties = new FileProcessing().loadProperties();
    NumberProcessor numberProcessor = new NumberProcessor();

    protected double parse(String propertiesValue) {
        return numberProcessor.parseNumber(properties.getProperty(propertiesValue), readOutputFormat()).doubleValue();
    }

    public double minimum() {
        return parse("min");
    }

    public double maximum() {
        return parse("max");
    }

    public double increment() {
        return parse("increment");
    }

    public List<Double> getListWithMultipliers(double min, double max, double increment) {
        ListOfMultipliersFactory list;
        if (min <= max) {
            list = new AscendingList();
        } else {
            list = new DescendingList();
        }
        return list.createList(min, max, increment);
    }

    public String readOutputFormat() {
        String outputFormat = System.getProperty("type");
        if (outputFormat == null) {
            outputFormat = "int";
        }
        return outputFormat;
    }

}
