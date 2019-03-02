package pl.mpas.advanced_programming.cars_comparing.ref_method;

import pl.mpas.advanced_programming.cars_comparing.Car;

public class CompareByModel {

    public int orderByModel(Car first, Car second){
        return
        first.getModel().compareTo(second.getModel());
    }
}
