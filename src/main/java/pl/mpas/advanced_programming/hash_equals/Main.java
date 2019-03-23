package pl.mpas.advanced_programming.hash_equals;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Person kamil = new Person("Kamil", "P");
        Person kamil2 = new Person("Kamil", "P");
        Person kamil3 = new Person("Kamil", "P");

        HashSet<Person> persons = new HashSet<>();
        persons.add(kamil);
        persons.add(kamil2);
        persons.add(kamil3);

        System.out.println("set size: " + persons.size());
        System.out.println("kamil.equals(kamil2): " + kamil.equals(kamil2));
        System.out.println("kamil.equals(kamil3): " + kamil.equals(kamil3));
        System.out.println("kamil2.equals(kamil3): " + kamil2.equals(kamil3));

        Set<Person> sortedSet = new TreeSet<>(Comparator.comparing(Person::getName).thenComparing(Person::getSurname));
        sortedSet.add(kamil);
        sortedSet.add(kamil2);
        sortedSet.add(kamil3);
        sortedSet.add(new Person("Olek", "W"));

        for (Person p: sortedSet) {
            System.out.println("Person: " + p);
        }

    }
}
