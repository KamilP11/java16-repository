package pl.mpas.advanced_programming.generic;

import pl.mpas.advanced_programming.abstract_class.Animal;
import pl.mpas.advanced_programming.abstract_class.Cat;
import pl.mpas.advanced_programming.abstract_class.Dog;

public class ArrayTest {

    public static void main(String[] args) {

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Azor");
        dogs[1] = new Dog("Dingo");

        Cat[]cats = new Cat[2];
        cats[0] = new Cat("Fifi");
        cats[1] = new Cat("Pi");

        Animal[] animals = dogs;
        Object[] objects = animals;

        displayAnimals(cats);
        displayAnimals(dogs);

        addDog(dogs);
        addDog(cats);

    }

    public static void addDog(Animal[] animals){
        if (animals instanceof Dog[]) {
            animals[0] = new Dog("big one");
        }
    }

    public static void displayAnimals(Animal[] animals){
        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }
}
