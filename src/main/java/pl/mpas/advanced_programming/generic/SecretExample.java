package pl.mpas.advanced_programming.generic;

import pl.mpas.advanced_programming.abstract_class.Cat;
import pl.mpas.advanced_programming.abstract_class.Dog;
import pl.mpas.advanced_programming.cars_comparing.Car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SecretExample {

    public static void main(String[] args) {

        MyStringSecret dream = new MyStringSecret("hahaha");
        MyBigDecimalSecret incoms = new MyBigDecimalSecret(BigDecimal.ZERO);

        MySecretGenericV1 integer = new MySecretGenericV1(Integer.valueOf(1));
        //MySecretGenericV1 integer = new MySecretGenericV1(1);
        MySecretGenericV1 anotherDream = new MySecretGenericV1("ahaaaaaaaaa");

        Integer secretInteger = (Integer) integer.getObject();

        checkMySecret(integer);
        checkMySecret(anotherDream);

        List animals = new ArrayList();
        animals.add(new Dog("Azor"));
        animals.add(new Cat("Fifi"));
        checkAnimals(animals);

        MySecondGeneric<String> stringSecret = new MySecondGeneric<>("secret");
        MySecondGeneric<BigDecimal> futureIncome = new MySecondGeneric<>(BigDecimal.valueOf(1_000_000));

        MySecondGeneric objectSecret = new MySecondGeneric(new Object());
        MySecondGeneric <Object> objectSecret2 = new MySecondGeneric<>(new Object());



    }

    public static void checkAnimals (List animals){
        for (Object animal: animals){
            if (animal instanceof Dog){
                System.out.println("Dog");
            } else if (animal instanceof Cat){
                System.out.println("Cat");
            } else {
                System.out.println("unknow animal");
            }
        }
    }

    public static void checkMySecret (MySecretGenericV1 secretGenericV1){
        if (secretGenericV1.getObject() instanceof Integer){
        Integer secret = (Integer) secretGenericV1.getObject();
        System.out.println("Secret: " + secret);
        }
    }
}
