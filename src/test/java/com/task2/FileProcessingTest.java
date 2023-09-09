//package com.task2;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.nio.charset.StandardCharsets;
//import java.util.Properties;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.*;
//
//class FileProcessingTest {
//
//    @Test
//    void readProperty() {
//    }
//
//    @Test
//    public void testReadPropertyOutOfJar() throws IOException {
//        Properties properties = new Properties();
//        String key = "min";
//        properties.setProperty(key, "10");
//        assertNotNull(FileProcessing.readPropertyOutOfJar(properties, key));
//    }
//
//    @Test
//    void testReadPropertyIntoJar() throws IOException {
//
//        Properties properties = new Properties();
//
//        String key = "value";
//        String value = "110";
//        properties.setProperty(key, value);
//        InputStream inputStream = new ByteArrayInputStream(value.getBytes());
//
//        ClassLoader classLoader = Mockito.mock(ClassLoader.class);
//        when(classLoader.getResourceAsStream(anyString())).thenReturn(inputStream);
//
//        assertEquals("110", FileProcessing.readPropertyIntoJar(properties, "value"));
//    }
//
//
//    @Test
//    void loadingProperties() throws IOException {
//        Properties properties = new Properties();
//        String output = "min=10";
//        String key = "min";
//        properties.setProperty(key, "10");
//
//
//        InputStream inputStream = new ByteArrayInputStream(output.getBytes(StandardCharsets.UTF_8));
//        assertTrue(FileProcessing.loadingProperties(inputStream, properties, key));
//    }
//}