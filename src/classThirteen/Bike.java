package classThirteen;

public final class Bike extends Vahicle{


    @Override
    public void startEngine() {
        System.out.println("Engine started");
        isRunning = true;
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
        isRunning = false;
    }

}
