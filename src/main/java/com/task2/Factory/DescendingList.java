package com.task2.Factory;

import java.util.ArrayList;
import java.util.List;

public class DescendingList implements ListOfMultipliersFactory {
    @Override
    public List<Double> createList(double min, double max, double increment) {
        List<Double> list = new ArrayList<>();
        for (double i = min; i >= max; i -= increment) {
            list.add(i);
        }
        return list;
    }
}
