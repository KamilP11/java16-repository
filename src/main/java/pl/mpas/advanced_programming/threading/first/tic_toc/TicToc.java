package pl.mpas.advanced_programming.threading.first.tic_toc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Job implements Runnable {

    private String message;
    Object syncObject;

    public Job(String message, Object syncObject) {
        this.message = message;
        this.syncObject = syncObject;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (syncObject) {
                System.out.println(message);
                try {
                    notify();
                    wait();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}

public class TicToc {
    public static void main(String[] args) {
        Object sync = new Object();
        Job tic = new Job("Tic", sync);
        Job toc = new Job("Toc", sync);


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(tic);
        executorService.execute(toc);


    }
}
