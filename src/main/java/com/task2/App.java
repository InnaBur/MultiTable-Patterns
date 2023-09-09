package com.task2;

import com.task2.Facade.FacadePattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws IOException {
        logger.info("Program starts!");

        FacadePattern facadePattern = new FacadePattern();
        facadePattern.showMultiplyTable();

        logger.info("Program was finished");
    }
}
