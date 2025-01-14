package classThirty;

public class ThreadImplementRunnable implements Runnable{

    @Override
    public void run() {

        for (int i = 1; i <= 20 ; i++) {
            System.out.println("Number: "+i);
           try {
               Thread.sleep(2000);
           } catch (InterruptedException ignore) {

           }
        }
    }
}
