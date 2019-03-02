package pl.mpas.advanced_programming.null_handling_java8;

import java.util.Optional;

public class Computer {

    private GraphicsCard graphicsCard;

    public Computer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Optional<GraphicsCard> getGraphicsCard() {
        return Optional.ofNullable(graphicsCard);

    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicsCard=" + graphicsCard +
                '}';
    }
}
