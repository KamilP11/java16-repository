package pl.mpas.advanced_programming.threading.first.tic_toc;

class Job implements Runnable{

    private String message;

    public Job(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true){
        System.out.println(message);
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    }
}


public class TicToc {
    public static void main(String[] args) {

        Thread one = new Thread(new Job("Tic"));
        one.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Thread two = new Thread(new Job("Toc"));
        two.start();
    }
}
