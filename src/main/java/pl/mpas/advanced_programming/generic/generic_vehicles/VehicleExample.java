package pl.mpas.advanced_programming.generic.generic_vehicles;

import java.util.ArrayList;
import java.util.List;

public class VehicleExample {

    public static void main(String[] args) {
        List<Vehicle> maybePlanes = new ArrayList<>();
        List<Vehicle> maybeCars = new ArrayList<>();
        List<Car> vehicles = new ArrayList<>();
        List<Plane> vehicles2 = new ArrayList<>();

        VehicleProcessor.displayVehicles(vehicles);
        VehicleProcessor.displayVehicles(vehicles2);

        VehicleProcessor.addNewCarIntoList(maybeCars);
        VehicleProcessor.addNewPlaneIntoList(maybePlanes);

//        VehicleProcessor.rawAdder(vehicles2);
//        vehicles2.get(0);
//        Plane p = vehicles2.get(0);

    }
}
