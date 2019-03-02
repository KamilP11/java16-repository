package pl.mpas.advanced_programming.cars_comparing.ref_method;

import pl.mpas.advanced_programming.cars_comparing.Car;

public class CompoundCarOrder {

    public static int orderByBrandNextByModelNextByYear(Car first, Car second) {

        int comparingResult = first.getBrand().compareTo(second.getBrand());
        if (0 != comparingResult) {
            return comparingResult;
        }
        comparingResult = first.getModel().compareTo(second.getModel());
        if (0 != comparingResult) {
            return comparingResult;
        }
        return first.getYearOfProduction().compareTo(second.getYearOfProduction());
    }


}
