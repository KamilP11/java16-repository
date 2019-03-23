package pl.mpas.advanced_programming.files;

public class Alcohol {

    private String brand;
    private String type;
    private int voltage;
    private double price;
    private boolean isTasty;


    public Alcohol(String brand, String type, int voltage, double price, boolean isTasty) {
        this.brand = brand;
        this.type = type;
        this.voltage = voltage;
        this.price = price;
        this.isTasty = isTasty;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getVoltage() {
        return voltage;
    }

    public double getPrice() {
        return price;
    }

    public boolean isTasty() {
        return isTasty;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", voltage=" + voltage +
                ", price=" + price +
                ", isTasty=" + isTasty +
                '}';
    }
}
