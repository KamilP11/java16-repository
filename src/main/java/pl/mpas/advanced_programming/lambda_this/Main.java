package pl.mpas.advanced_programming.lambda_this;

public class Main {

    public void move(){
        System.out.println("move() inside main");
    }

    public Main(){

    }

    public Main (String name){
        this.name = name;
    }

    private String name = "Main";

    public Movable makeOne(){
        return new Movable() {
            private String name = "Moveable";

            @Override
            public void move() {
                System.out.println("inside anonymous class - move()");
                System.out.println("name = " + this.name);
                System.out.println("External name: " + Main.this.name);
                this.move();
            }
        };
    }

    public Movable makeOneWithLambda (){
        String name = "haha";
        return () -> {
            this.move();//inne znaczenie dla lambd - odwołuje się do metody w klasie Main.
            move();
            System.out.println(this.name);// tak samo - nie odwołuje się do klasy anonimowej utworzeonej przez lamdę, lecz do pola w Main.
        };
//        System.out.println("inside anonymous class - move()");
    }

    public String getName(){
        return name;
    }


    public static void main(String[] args) {

    }
}
