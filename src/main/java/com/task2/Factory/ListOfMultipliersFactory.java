package com.task2.Factory;

import java.util.List;

public interface ListOfMultipliersFactory {

    List<Double> createList(double min, double max, double increment);
}
