package pl.mpas.advanced_programming.threading.first.atomic;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise1 {

    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(0);
        ExecutorService workers = Executors.newFixedThreadPool(3);


        Runnable job = ()->{

            for (int i=0; i<100; i++){
              int tmp = integer.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + " i = " + tmp);
          }
        };

        workers.execute(job);
        workers.execute(job);
        workers.execute(job);
        workers.shutdown();

        boolean done = false;

        do {

            try {
                done = workers.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!done);

        System.out.println("result = " + integer);


    }

}
