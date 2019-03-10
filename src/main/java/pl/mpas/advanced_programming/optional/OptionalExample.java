package pl.mpas.advanced_programming.optional;

import java.util.Objects;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        doSomething("Ala ma kota");
        doSomething(null);

    }

    public static void doSomething(String isNullOrNot){

        Objects.requireNonNull(isNullOrNot);
        //Optional.ofNullable(isNullOrNot);
        Optional.of(isNullOrNot);

    }

    public static Optional<String> getPersonNick(){
        return Optional.empty();
    }
}
