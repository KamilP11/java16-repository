package pl.mpas.advanced_programming.cars_comparing;

import java.util.Comparator;

public class CarBrandComparator implements Comparator <Car> {

    @Override
    public int compare(Car o1, Car o2) {

        return o1.getColour().compareTo(o2.getColour());
    }
}
