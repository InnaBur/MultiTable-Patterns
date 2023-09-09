package com.task2.Strategy;

public class LongNumber implements NumberProcessorStrategy {
    @Override
    public Number parseNumber(String value) {
        return Long.parseLong(value);
    }

    @Override
    public Number result(double result) {
        if (result <= Long.MAX_VALUE && result >= Long.MIN_VALUE) {
            return (long) result;
        } else {
            throw new ArithmeticException("Long overflow resulting in incorrect value");
        }
    }
}
