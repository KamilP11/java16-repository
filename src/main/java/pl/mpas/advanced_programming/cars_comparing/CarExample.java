package pl.mpas.advanced_programming.cars_comparing;

import pl.mpas.advanced_programming.cars_comparing.ref_method.CompoundCarOrder;
import pl.mpas.advanced_programming.cars_comparing.ref_method.CompareByModel;

import java.time.Year;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarExample {
    public static void main(String[] args) {
        List<Car> myCars = Arrays.asList(
                new Car("blue", 2.5f, "93", "Saab", Year.of(2000)),
                new Car("red", 1.8f, "W202", "Mercedes-Benz", Year.of(1997)),
                new Car("white", 3.6f, "300C", "Chrysler", Year.of(2015))
        );

        System.out.println("before first sorting");
        System.out.println(myCars);
        System.out.println("after natural ordering");
        Collections.sort(myCars);
        System.out.println(myCars);

//        Car carToCompare = new Car("black", 2.0f, "Focus","Ford", Year.of(2010));
//        carToCompare.maybeComparing((Car o) -> 1);

        System.out.println("After sorting by colour...");
        Collections.sort(myCars, new CarBrandComparator());
        System.out.println(myCars);

        myCars.sort(new Comparator<Car>(){
            @Override
            public int compare(Car o1, Car o2){
                return 0;
            }
        });

        myCars.sort((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()));

        CompareByModel anotherModelComparingWay = new CompareByModel();

        myCars.sort((car1, car2) -> {
          return anotherModelComparingWay.orderByModel(car1, car2);
        });

        myCars.sort((car1, car2) -> anotherModelComparingWay.orderByModel(car1, car2));

        myCars.sort(anotherModelComparingWay::orderByModel);

       myCars.sort(((o1, o2) -> CompoundCarOrder.orderByBrandNextByModelNextByYear(o1,o2)));
       myCars.sort((CompoundCarOrder::orderByBrandNextByModelNextByYear));

       myCars.sort(Comparator.comparing(Car::getBrand).thenComparing(Car::getModel).thenComparing(Car::getYearOfProduction).thenComparing(Car::getCapacity).thenComparing(Car::getColour));
    }
}
