package com.task2.Facade;

import com.task2.DataProcessing;
import com.task2.PrintingResults;

import java.io.IOException;

public class FacadePattern {

    PrintingResults printingResults = new PrintingResults();
    DataProcessing dataProcessing = new DataProcessing();

    public void showMultiplyTable() throws IOException {
        String outputFormat = dataProcessing.readOutputFormat();

        printingResults.tableAsString(dataProcessing.minimum(), dataProcessing.maximum(),
                dataProcessing.increment(), outputFormat);
    }
}
