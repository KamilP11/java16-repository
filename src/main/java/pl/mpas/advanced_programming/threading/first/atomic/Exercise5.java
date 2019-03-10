package pl.mpas.advanced_programming.threading.first.atomic;

public class Exercise5 {
    public static void main(String[] args) {
        Person me = new Person("Kamil", "Paradziński", null);

        try {
            System.out.println("Before calling");
            synchronized (me){
                me.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
