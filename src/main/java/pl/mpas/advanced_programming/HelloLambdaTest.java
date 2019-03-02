package pl.mpas.advanced_programming;


@FunctionalInterface
interface HelloLambda {
    void sayHello();

}

@FunctionalInterface
interface Test {

    void doSomething (int a, String name);

    default void someMethod1(){
        System.out.println("someMethod1");
    };

    default void someMethod2(){
        System.out.println("someMethod2");
    };


    class HelloLambdaTest {
    public static void main(String[] args) {

        HelloLambda helloLambda = () -> {
            System.out.println("Hello World");
            };

        helloLambda.sayHello();

        useTest((a,b) -> System.out.println("" + a + a + " -- " + b + b), 5 , "Mariusz");
        useTest((int a, String c)-> System.out.println("" + a+ a + a + " --- " + c + c + c ), 10, ".");

    }
    static void useTest(Test test,int a, String s){
        test.doSomething(a,s);
    }
    }
}
