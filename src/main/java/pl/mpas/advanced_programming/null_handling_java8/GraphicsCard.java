package pl.mpas.advanced_programming.null_handling_java8;

import java.util.Optional;

public class GraphicsCard {

    private Chipset chipset;

    public GraphicsCard(Chipset chipset) {
        this.chipset = chipset;
    }

    public Optional <Chipset> getChipset() {
        return Optional.ofNullable(chipset);
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "chipset=" + chipset +
                '}';
    }
}
