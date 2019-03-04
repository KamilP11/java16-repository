package pl.mpas.advanced_programming.generic.generic_vehicles;

import java.util.List;

public class VehicleProcessor {

    public static void displayVehicles(List<? extends Vehicle> vehicles){
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }
//        vehicles.forEach(System.out::println);
//        vehicles.forEach(x->System.out.println(x));
    };

    public static void addNewCarIntoList(List<? super Vehicle> vehicles){
        vehicles.add(new Car());
    };

    public static void addNewPlaneIntoList(List<? super Vehicle> vehicles){
        vehicles.add(new Plane());
    };

//    static void rawAdder(List maybeCars){
//        maybeCars.add(new Car());
//    }
}
