package com.task2;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrintingResultsTest {

    @Test
    void testPrintingResultsForByte() {
        PrintingResults printingResults = new PrintingResults();
        DataProcessing dataProcessing = new DataProcessing();
        String outputFormat = "byte";

        List<Double> multiplier = dataProcessing.getListWithMultipliers(1, 2, 1);
        String result = printingResults.printResults(multiplier, outputFormat);
        String expectedResult = "\n1.0 * 1.0 = 1\n1.0 * 2.0 = 2\n2.0 * 1.0 = 2\n2.0 * 2.0 = 4";

        assertEquals(expectedResult, result);
    }

    @Test
    void testPrintingResultsForDouble() {
        PrintingResults printingResults = new PrintingResults();
        DataProcessing dataProcessing = new DataProcessing();
        String outputFormat = "double";

        List<Double> multiplier = dataProcessing.getListWithMultipliers(400.5, 500.5, 50.5);
        String result = printingResults.printResults(multiplier, outputFormat);
        String expectedResult = "\n400.5 * 400.5 = 160400.25\n400.5 * 451.0 = 180625.5\n" +
                "451.0 * 400.5 = 180625.5\n451.0 * 451.0 = 203401.0";

        assertEquals(expectedResult, result);
    }

    @Test
    void testPrintingResultsForInt() {
        PrintingResults printingResults = new PrintingResults();
        DataProcessing dataProcessing = new DataProcessing();
        String outputFormat = "int";

        List<Double> multiplier = dataProcessing.getListWithMultipliers(1100, 2200, 1100);
        String result = printingResults.printResults(multiplier, outputFormat);
        String expectedResult = "\n1100.0 * 1100.0 = 1210000\n1100.0 * 2200.0 = 2420000\n" +
                "2200.0 * 1100.0 = 2420000\n2200.0 * 2200.0 = 4840000";

        assertEquals(expectedResult, result);
    }

    @Test
    void testPrintingResultsForFloat() {
        PrintingResults printingResults = new PrintingResults();
        DataProcessing dataProcessing = new DataProcessing();
        String outputFormat = "float";

        List<Double> multiplier = dataProcessing.getListWithMultipliers(1.25, 2.00, 0.50f);
        String result = printingResults.printResults(multiplier, outputFormat);
        String expectedResult = "\n1.25 * 1.25 = 1.563\n1.25 * 1.75 = 2.188\n" +
                "1.75 * 1.25 = 2.188\n1.75 * 1.75 = 3.063";

        assertEquals(expectedResult, result);
    }


    @Test
    void testPrintingResultsForPositiveIncrement() {
        PrintingResults printingResults = new PrintingResults();
        String outputFormat = "int";

        assertThrows(IOException.class, () -> printingResults.tableAsString(1, 5, -1, outputFormat),
                "Increment must be positive");
    }
//
//    @Test
//    void testIfReturningResultIsByte() {
//        byte result = -127;
//        assertEquals(-127, PrintingResults.resultByte(result));
//        assertThrows(ArithmeticException.class, () -> PrintingResults.resultByte(129),
//                "byte overflow resulting in incorrect value");
//    }
//
//    @Test
//    void testIfReturningResultIsLong() {
//        long result = 1456000000;
//        assertEquals(1456000000, PrintingResults.resultLong(result));
//    }
//
//    @Test
//    void testIfReturningResultIsFloat() {
//        float result = 1.4568356f;
//        float delta = 0.001f;
//        assertEquals(1.457, PrintingResults.resultFloat(result), delta);
//        assertThrows(ArithmeticException.class, () -> PrintingResults.resultFloat(Float.POSITIVE_INFINITY),
//                "Float overflow resulting in INFINITY");
//    }
//
//    @Test
//    void testIfReturningResultIsDouble() {
//        double result = 2.23;
//        assertEquals(2.23, PrintingResults.resultDouble(result));
//        assertThrows(ArithmeticException.class, () -> PrintingResults.resultDouble(Double.POSITIVE_INFINITY),
//                "Double overflow resulting in INFINITY");
//    }
//
//    @Test
//    void testIfReturningResultIsInt() {
//        int result = Integer.MAX_VALUE;
//        assertEquals(2147483647, PrintingResults.resultInt(result));
//    }


}