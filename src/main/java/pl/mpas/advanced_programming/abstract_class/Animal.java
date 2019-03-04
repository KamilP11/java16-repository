package pl.mpas.advanced_programming.abstract_class;

import java.util.Objects;

public abstract class Animal {
    private static final int NAME_MIN_LEN = 1;
    protected String name;

    public Animal(String name) {

        this.name = Objects.requireNonNull(name, "[name] cannot be null!!!");
        if (name.length()<NAME_MIN_LEN) {
            throw new RuntimeException("name too short: [" + name + "], minimal length is: " + NAME_MIN_LEN);
        }
    }

    public abstract void eat();

    public abstract void play();

}
