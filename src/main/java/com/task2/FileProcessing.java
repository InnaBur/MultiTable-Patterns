package com.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class FileProcessing {
    private static final Logger logger = LoggerFactory.getLogger(FileProcessing.class);
    private static final String PROPERTIES_FILE_NAME = "config.properties";

    public Properties loadProperties() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = findFileByClasspath(PROPERTIES_FILE_NAME);
            assert inputStream != null;
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            properties.load(reader);
            logger.debug("Properties were loaded");
        } catch (IOException e) {
            logger.error("Properties were not loaded ");
        }
        return properties;
    }

    protected InputStream findFileByClasspath(String fileName) throws FileNotFoundException {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new FileNotFoundException("File " + fileName + " not found");
        }
        logger.debug("File {} was found", fileName);
        return inputStream;
    }

}
