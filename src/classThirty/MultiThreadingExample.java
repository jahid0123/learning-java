package classThirty;

public class MultiThreadingExample extends Thread{

    private int i;

    public MultiThreadingExample() {

    }

    public MultiThreadingExample(int i){
        this.i = i;
    }

    @Override
    public void run() {
        for (int j = 1; j <= 50; j++) {
            System.out.println("Number of: "+j);

        }
    }
}
