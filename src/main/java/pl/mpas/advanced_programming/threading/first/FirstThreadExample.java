package pl.mpas.advanced_programming.threading.first;

public class FirstThreadExample {

    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.println("Worker: " + Thread.currentThread().getName());
            System.out.println("Run Forest");
        };

        job.run();

        Thread worker = new Thread(job, "Pracuś");
//        worker.setName("Worker"); //inicjacja imienia w konstruktorze powyżej
        worker.run();
        worker.start();
//        worker.start(); można wątek wystartować tylko raz

    }
}
