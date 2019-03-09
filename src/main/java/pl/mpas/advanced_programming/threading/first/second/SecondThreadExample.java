package pl.mpas.advanced_programming.threading.first.second;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SecondThreadExample {
    public static void main(String[] args) {
        Thread.currentThread().setName("Boss");
        System.out.println("main() - beginning...");

        Runnable job = () ->{

            for (int i=0; i<10; i++){
                System.out.println("Run by: " + Thread.currentThread().getName() +
                        ", iteration: " + (i+1));
            }

//            for (int i=0; i<10; i++){
//                System.out.println("ABCDEFGHIJ " + Thread.currentThread().getName());
//            }
//            for (int i=0; i<10; i++){
//                System.out.println("ZXY " + Thread.currentThread().getName());
//            }
        };

        //job.run();

        Thread worker1 = new Thread (job, "Stefan");
        worker1.setDaemon(true);
        Thread worker2 = new Thread (job, "Janusz");
        worker2.setDaemon(true);
        worker1.run();
        worker1.start();
        System.out.println("inside main");
        worker2.start();

        System.out.println("main() - end");
        }
    }
