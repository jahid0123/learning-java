package classThirty;

public class Main {

    public static void main(String[] args) {
/*        MultiThreadingExample mte = new MultiThreadingExample();

        mte.start();
        System.out.println("Jahid Ahmed");*/

        ThreadImplementRunnable task = new ThreadImplementRunnable();
        Thread thread = new Thread(task);
        thread.start();
        thread.setName("Hemel");
        System.out.println(thread.getName());
    }
}
