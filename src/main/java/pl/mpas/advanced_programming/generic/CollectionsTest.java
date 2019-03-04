package pl.mpas.advanced_programming.generic;

import pl.mpas.advanced_programming.abstract_class.Animal;
import pl.mpas.advanced_programming.abstract_class.Cat;
import pl.mpas.advanced_programming.abstract_class.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {

        List<Animal> someList = new ArrayList<>();
        someList.add(new Dog("Azor"));
        someList.add(new Cat("Fifi"));
        displayAnimals(someList);
        addAnimal(someList);


        List<Dog> dogs = Arrays.asList(
                new Dog("Azor"),
                new Dog("Pimpek")
        );


        List<Cat> cats = Arrays.asList(
                new Cat("Fifi"),
                new Cat("Mruczuś")
        );

        displayAnimals(dogs);
        displayAnimals(cats);
    }

    public static void displayAnimals(List<? extends Animal> animals){
        for (Animal animal:animals) {
            System.out.println(animal);

        }
        //don't do it
        //animals.add(new Dog("Azor"));
    }

    public static void addAnimal(List<? super Animal> animals){
        animals.add(new Dog("Azor"));
    }

}
