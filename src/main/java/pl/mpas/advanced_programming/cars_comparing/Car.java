package pl.mpas.advanced_programming.cars_comparing;

import java.time.Year;

public class Car implements Comparable <Car>{
    private String colour;
    private float capacity;
    private String model;
    private String brand;
    private Year yearOfProduction;

    public Car(String colour, float capacity, String model, String brand, Year yearOfProduction) {
        this.colour = colour;
        this.capacity = capacity;
        this.model = model;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Year getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Year yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", capacity=" + capacity +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public int compareTo(Car o) {
       return yearOfProduction.compareTo(o.getYearOfProduction());
        //return this.yearOfProduction.getValue() - o.yearOfProduction.getValue();
    }

//    public void maybeComparing(Comparable<Car> comparable){
//        System.out.println("inside maybeComparing");
//        System.out.println(comparable.compareTo(this));
//    }
}
