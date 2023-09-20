package com.task2.Factory;

import java.util.List;

public class ListFactoryCreator {
    public static ListOfMultipliersFactory createListFactory(double min, double max) {

        if (min <= max) {
            return new AscendingList();
        } else {
            return new DescendingList();
        }
    }
}
