package com.task2.Strategy;

public class IntegerNumber implements NumberProcessorStrategy {
    @Override
    public Number parseNumber(String value) {
        return Integer.parseInt(value);
    }

    @Override
    public Number result(double result) {
        if (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE) {
            return (int) result;
        } else {
            throw new ArithmeticException("Integer overflow resulting in incorrect value");
        }
    }
}
