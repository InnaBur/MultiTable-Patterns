package com.task2.Strategy;

public class DoubleNumber implements NumberProcessorStrategy {
    @Override
    public Number parseNumber(String value) {
        return Double.parseDouble(value);
    }

    @Override
    public Number result(double result) {
        if (!Double.isInfinite(result)) {
            return (double) Math.round(result * 1000) / 1000;
        } else {
            throw new ArithmeticException("Double overflow resulting in INFINITY");
        }
    }
}
