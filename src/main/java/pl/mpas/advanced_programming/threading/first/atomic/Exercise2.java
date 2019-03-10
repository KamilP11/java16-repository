package pl.mpas.advanced_programming.threading.first.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise2 {

        volatile static long counter = 0;

        public static void main(String[] args) {

            Runnable increaseJob = () -> {
                long currentCounterValue;
                for (int i = 0; i < 500_000; i++) {

//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                    synchronized (Exercise2.class) {
                        currentCounterValue = ++counter;
                    }

                    System.out.println(String.format("Current value: [%s], from thred: [%s]",
                            currentCounterValue, Thread.currentThread().getName()));
                }
            };

            Runnable showJob = () -> {
                while (counter < 500_000) {
                    System.out.println("Value: [" + counter + "]");
                }
            };

            ExecutorService workers = Executors.newFixedThreadPool(4);
            workers.execute(showJob);
            workers.execute(increaseJob);
            workers.execute(increaseJob);
            workers.execute(increaseJob);
}
}

