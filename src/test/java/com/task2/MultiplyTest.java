//package com.task2;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MultiplyTest {
//
//    @Test
//    void multiplyPrimitives() {
//        assertEquals("100", Multiply.multiplyPrimitives(10, 10, "byte").toString());
//        assertThrows(ArithmeticException.class, () -> Multiply.multiplyPrimitives(200, 200,
//                "byte"), "Unknown data type");
//
//        assertEquals("-4209.102", Multiply.multiplyPrimitives(9, -467.678, "double").toString());
//        assertThrows(ArithmeticException.class, () -> Multiply.multiplyPrimitives(10, Double.MAX_VALUE,
//                "double"), "Double overflow resulting in INFINITY");
//
//        assertEquals("399.96", Multiply.multiplyPrimitives(2, 199.98f, "float").toString());
//        assertThrows(ArithmeticException.class, () -> Multiply.multiplyPrimitives(10, Float.MAX_VALUE,
//                "float"), "Float overflow resulting in INFINITY");
//
//        assertEquals("100", Multiply.multiplyPrimitives(10, 10, "int").toString());
//        assertThrows(ArithmeticException.class, () -> Multiply.multiplyPrimitives(10, Integer.MAX_VALUE,
//                "int"), "Integer overflow resulting in incorrect value");
//
//        assertEquals("45517878", Multiply.multiplyPrimitives(12457, 3654, "long").toString());
//        assertThrows(ArithmeticException.class, () -> Multiply.multiplyPrimitives(10, Long.MAX_VALUE,
//                "long"), "Long overflow resulting in incorrect value");
//    }
//
//    @Test
//    void multiply() {
//        assertEquals("0.0", Double.toString(Multiply.multiply(123.9, 0)));
//        assertEquals("50.0", Double.toString(Multiply.multiply(10, 5)));
//        assertEquals("0.0", Double.toString(Multiply.multiply(123.9, 0)));
//        assertEquals("-4209.102", Double.toString(Multiply.multiply(9, -467.678)));
//    }
//}