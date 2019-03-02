package pl.mpas.advanced_programming.abstract_class;

public class AnimalExample {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        myZoo.handleAnimal(new Animal("Azor") {
            @Override
            public void eat() {
                System.out.println("Eating...");
            }

            @Override
            public void play() {

            }
        });


    }
}
