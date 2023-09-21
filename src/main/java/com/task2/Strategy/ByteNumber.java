package com.task2.Strategy;

public class ByteNumber implements NumberProcessorStrategy {
    @Override
    public Number parseNumber(String value) {
        return Byte.parseByte(value);
    }

    @Override
    public Number result(double result) {
        if (result <= Byte.MAX_VALUE && result >= Byte.MIN_VALUE) {
            return (byte) result;
        } else {
            throw new NumberFormatException("byte overflow resulting in incorrect value");
        }
    }
}
