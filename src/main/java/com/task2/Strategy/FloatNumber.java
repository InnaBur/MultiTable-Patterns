package com.task2.Strategy;

public class FloatNumber implements NumberProcessorStrategy {
    @Override
    public Number parseNumber(String value) {
        return Float.parseFloat(value);
    }

    @Override
    public Number result(double result) {
        if (!Float.isInfinite((float) result)) {
            return Math.round(result * 1000) / 1000f;
        } else {
            throw new ArithmeticException("Float overflow resulting in INFINITY");
        }
    }
}
