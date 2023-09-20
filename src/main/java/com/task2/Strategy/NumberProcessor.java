package com.task2.Strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class NumberProcessor {

    private static final Logger logger = LoggerFactory.getLogger(NumberProcessor.class);
    private final Map<String, NumberProcessorStrategy> numbers = new HashMap<>();

    public NumberProcessor() {
        numbers.put("int", new IntegerNumber());
        numbers.put("double", new DoubleNumber());
        numbers.put("float", new FloatNumber());
        numbers.put("long", new LongNumber());
        numbers.put("byte", new ByteNumber());
    }

    public Number parseNumber(String value, String outputFormat) {
        NumberProcessorStrategy numberProcessorStrategy = numbers.get(outputFormat);
        if (numberProcessorStrategy == null) {
            logger.info("{} - Unsupported type. Type is currently in use -  Integer", outputFormat);
            numberProcessorStrategy = new IntegerNumber();
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
            numberProcessorStrategy = new IntegerNumber();
        }
        try {
            return numberProcessorStrategy.result(value);

        } catch (NumberFormatException e) {
            logger.error("Unknown data type");
            throw new ArithmeticException("Unknown data type");
        }
    }
}
