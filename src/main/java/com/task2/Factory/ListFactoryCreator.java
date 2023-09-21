package com.task2.Factory;

public class ListFactoryCreator {

    public  ListOfMultipliersFactory createListFactory(double min, double max) {
        if (min <= max) {
            return new AscendingList();
        } else {
            return new DescendingList();
        }
    }
}
