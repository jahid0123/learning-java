package classTen;

public class Car extends Vehicle{

    private int numberOfDoor;


    public Car() {
    }

    public Car(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public Car(String engineBrand, int seatNumber, int numberOfWheel, int numberOfDoor) {
        super(engineBrand, seatNumber, numberOfWheel);
        this.numberOfDoor = numberOfDoor;
    }


    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

}
