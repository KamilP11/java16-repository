package pl.mpas.advanced_programming.threading.first.third;

public class Example {
    public static void main(String[] args) {
        Thread.currentThread().setName("Main Worker: ");

        Runnable job = ()->
        {for (int i =0; i<10; i++) {
            System.out.println("Run by: " + Thread.currentThread().getName() + (i+1));
        }
    };

        Runnable job2 = ()-> {

            for (int i=0; i<3; i++){
                String daemonName = Thread.currentThread().getName() + "-" + "daemon-" + (i+1) + "-";
                Thread newWorker = new Thread(job, daemonName);
                newWorker.setDaemon(true);
                newWorker.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        job.run();

        Thread worker1 = new Thread(job2, "Worker1");
        worker1.setPriority(Thread.MAX_PRIORITY);
        worker1.start();

        Thread worker2 = new Thread(job2, "Worker2");
        worker2.setPriority(Thread.MIN_PRIORITY);
        worker2.start();

    }
}
