//package com.task2;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class DataProcessingTest {
//    @Test
//    void testIfOutputFormatRead() {
//        DataProcessing dataProcessing = new DataProcessing();
//        System.setProperty("type", "float");
//        String outputFormat = dataProcessing.readOutputFormat();
//        assertEquals("float", outputFormat);
//
//        System.clearProperty("type");
//        outputFormat = dataProcessing.readOutputFormat();
//        assertEquals("int", outputFormat);
//    }
//
//    @Test
//    void testIfOutputFormatIsNull() {
//        DataProcessing dataProcessing = new DataProcessing();
//        String outputFormat = dataProcessing.readOutputFormat();
//        assertEquals("int", outputFormat);
//    }
//
//    @Test
//    void testIfNumberParseToDouble() {
//        DataProcessing dataProcessing = new DataProcessing();
//        String value = "88.123";
//        String outputFormat = "double";
//
//        Number result = dataProcessing.parseNumber(value, outputFormat);
//
//        assertTrue(result instanceof Double);
//        assertFalse(result instanceof Integer);
//        assertEquals(Double.parseDouble(value), result);
//    }
//
//    @Test
//    void testIfNumberParseToLong() {
//        DataProcessing dataProcessing = new DataProcessing();
//        String value = "9223372036854775807";
//        String outputFormat = "long";
//
//        Number result = dataProcessing.parseNumber(value, outputFormat);
//
//        assertTrue(result instanceof Long);
//        assertEquals(Long.parseLong(value), result);
//    }
//
//    @Test
//    void testIfNumberParseToInt() {
//        DataProcessing dataProcessing = new DataProcessing();
//        String value = "88";
//        String outputFormat = "int";
//
//        Number result = dataProcessing.parseNumber(value, outputFormat);
//
//        assertTrue(result instanceof Integer);
//        assertEquals(Integer.parseInt(value), result);
//    }
//
//    @Test
//    void testIfExceptionWhenNumberNotParsed() {
//        DataProcessing dataProcessing = new DataProcessing();
//        assertThrows(NumberFormatException.class, () -> dataProcessing.parseNumber("10", "none"),
//                "Unsupported type");
//    }
//
//    @Test
//    void testIfOutputFormatIsInt() {
//        assertTrue(DataProcessing.intType("int"));
//    }
//
//
//    @Test
//    void testIfOutputFormatIsDouble() {
//        assertTrue(DataProcessing.doubleType("double"));
//    }
//
//    @Test
//    void testIfOutputFormatIsFloat() {
//        assertTrue(DataProcessing.floatType("float"));
//    }
//
//    @Test
//    void testIfOutputFormatIsLong() {
//        assertTrue(DataProcessing.longType("long"));
//        assertFalse(DataProcessing.longType("double"));
//    }
//
//    @Test
//    void testIfOutputFormatIsByte() {
//        assertTrue(DataProcessing.byteType("byte"));
//    }
//
//
//    @Test
//    void addDigitsInArrayList() {
//        DataProcessing dataProcessing = new DataProcessing();
//        String expected = "[1.0, 3.0, 5.0]";
//        String result = dataProcessing.addDigitsInArrayList(1, 5, 2).toString();
//        assertEquals(expected, result);
//    }
//
//    @Test
//    void addDigitsInArrayListIfMinMoreThenMax() {
//        DataProcessing dataProcessing = new DataProcessing();
//        String expected = "[10.0, 5.0, 0.0, -5.0]";
//        String result = dataProcessing.addDigitsInArrayListIfMinMoreThenMax(10, -5, 5).toString();
//        assertEquals(expected, result);
//    }
//
//    @Test
//    void testGettingAnArrayList() {
//        DataProcessing dataProcessing = new DataProcessing();
//
//        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(10.5, 16.0));
//        ArrayList<Double> result = dataProcessing.getArrayList(10.5, 20.5, 5.5);
//        assertEquals(expected, result);
//    }
//
//}