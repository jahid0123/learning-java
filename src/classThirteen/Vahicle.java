package classThirteen;

public sealed abstract class Vahicle implements VehicleInterface permits Bike, Car {

    protected boolean isRunning;



    public void isRunning(){
        if (isRunning){

            System.out.println("Running");
        }else {
            System.out.println("Not Running");
        }
    }
}
