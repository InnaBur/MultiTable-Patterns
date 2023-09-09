package com.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintingResults {
    private static final Logger logger = LoggerFactory.getLogger(PrintingResults.class);

    Multiply multiply = new Multiply();

    public String printResults(List<Double> multiplier, String outputFormat) {
        StringBuilder stringBuilder = new StringBuilder();
        for (double multiplierOne : multiplier) {
            for (double multiplierTwo : multiplier) {
                String res = multiply.multiplyPrimitives(multiplierOne, multiplierTwo, outputFormat).toString();
                stringBuilder.append("\n").append(multiplierOne).append(" * ")
                        .append(multiplierTwo).append(" = ").append(res);
                logger.debug("{} * {} = {}", multiplierOne, multiplierTwo, res);
            }
        }
        return stringBuilder.toString();
    }

    public String tableAsString(double min, double max, double increment, String outputFormat) throws IOException {
        String s;
        if (increment <= 0) {
            throw new IOException("Increment must be positive");
        } else {
            List<Double> list = new DataProcessing().getListWithMultipliers(min, max, increment);
            s = printResults(list, outputFormat);
        }
        return s;
    }

}
