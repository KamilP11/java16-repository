package pl.mpas.advanced_programming.generic.optional;

import java.util.Optional;
import java.util.function.Predicate;

public class GenericOptionalTest {

    public static void main(String[] args) {
        Optional<String> maybeMyName = Optional.of("Kamil");

        System.out.println(checkIfNameMatch("Kamil", maybeMyName));
        System.out.println(checkIfNameMatch("Witek", maybeMyName));
    }

    public static boolean checkIfNameMatch(String name, Optional<String> maybeName){

        Predicate<String> stringTest = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return name.equals(s);
            }
        };

        Predicate<CharSequence> charSequencePredicate = new Predicate<CharSequence>() {
            @Override
            public boolean test(CharSequence charSequence) {
                return name.equals(charSequence);
            }
        };

        System.out.println("Testing...");
        System.out.println("1st: " + maybeName.filter(stringTest));
        System.out.println("1st with char sequence: " + maybeName.filter(charSequencePredicate));

        System.out.println("1st: " + maybeName.filter(charSequencePredicate::test));
        System.out.println("1st with char sequence: " + maybeName.filter(charSequencePredicate));

        return maybeName.filter(s -> s.equals(name)).isPresent();
    }
}
