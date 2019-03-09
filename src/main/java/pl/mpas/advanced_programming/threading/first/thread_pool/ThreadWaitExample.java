package pl.mpas.advanced_programming.threading.first.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadWaitExample {

    static private int i = 0;

    public static void main(String[] args) {

        Runnable job = () -> {
            synchronized (ThreadWaitExample.class) {
                i++;
            }
        };

        ExecutorService workers = Executors.newFixedThreadPool(4);

        for (int j = 0; j < 2_000_000; j++) {
            workers.execute(job);
        }

        workers.shutdown();

        boolean done = false;

        //1. sposób:
//        do {
//
//            try {
//                done = workers.awaitTermination(1, TimeUnit.SECONDS);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        } while (!done);

        //2. sposób:
        while (true){
            try {
                done = workers.awaitTermination(1, TimeUnit.SECONDS);
                if (done){
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            System.out.println("i = " + i);

    }


}
