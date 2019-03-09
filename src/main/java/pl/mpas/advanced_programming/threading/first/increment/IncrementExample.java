package pl.mpas.advanced_programming.threading.first.increment;

class Job implements Runnable {
    private int toIncrement = 0;
    private static int staticIncrement = 1;

    static public void incStatic(){
        synchronized (Job.class){
            staticIncrement++;
        }

    }

    @Override
    public String toString() {
        return "toIncrement: " + toIncrement;
    }

    @Override
    //synchronized
    public void run() {

        for (int i = 0; i < 50_000; i++) {
            System.out.println("Increased by thread: " + Thread.currentThread().getName());

            synchronized (this) {
                toIncrement++;
            }
        }
    }
}

public class IncrementExample {

    public static void main(String[] args) throws InterruptedException {
        Job job = new Job();

        Thread worker1 = new Thread(job, "Janusz");
        Thread worker2 = new Thread(job, "Andrzej");
        worker1.start();
        worker2.start();

        worker1.join();
        worker2.join();

        System.out.println("Current job value: " + job);
    }
}
