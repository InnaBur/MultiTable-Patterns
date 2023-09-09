package com.task2.Strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class NumberProcessor {

    private static final Logger logger = LoggerFactory.getLogger(NumberProcessor.class);
    private Map<String, NumberProcessorStrategy> numbers = new HashMap<>();

    public NumberProcessor() {
        numbers.put("int", new IntegerNumber());
        numbers.put("double", new DoubleNumber());
        numbers.put("float", new FloatNumber());
        numbers.put("long", new LongNumber());
        numbers.put("byte", new ByteNumber());
        numbers.put(null, new IntegerNumber());
    }

    public Number parseNumber(String value, String outputFormat) {
        NumberProcessorStrategy numberProcessorStrategy = numbers.get(outputFormat);
        if (numberProcessorStrategy == null) {
            throw new NumberFormatException("Unsupported type");
        }
        try {
            return numberProcessorStrategy.parseNumber(value);

        } catch (NumberFormatException e) {
            logger.error("Inputted number {} is not {} ", value, outputFormat);
            throw new NumberFormatException("Unsupported type");
        }
    }

    public Number resultReturning(double value, String outputFormat) {
        NumberProcessorStrategy numberProcessorStrategy = numbers.get(outputFormat);
        if (numberProcessorStrategy == null) {
            throw new NumberFormatException("Unsupported type");
        }
        try {
            return numberProcessorStrategy.result(value);

        } catch (NumberFormatException e) {
            logger.error("Unknown data type");
            throw new ArithmeticException("Unknown data type");
        }
    }
}
