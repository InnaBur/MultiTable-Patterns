package com.task2;

import com.task2.Strategy.NumberProcessor;

public class Multiply {

    NumberProcessor numberProcessor = new NumberProcessor();

    public Number multiplyPrimitives(double i, double j, String outputFormat) {
        double result = multiply(i, j);
        return numberProcessor.resultReturning(result, outputFormat);
    }

    public static double multiply(double x, double y) {
        return x * y;
    }
}
