package pl.mpas.advanced_programming.null_handling_java8;

public class Chipset {

    private String vendorName;

    public Chipset(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorName() {
        return vendorName;
    }

    @Override
    public String toString() {
        return "Chipset{" +
                "vendorName='" + vendorName + '\'' +
                '}';
    }
}
