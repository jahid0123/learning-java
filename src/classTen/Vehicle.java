package classTen;

public class Vehicle {
    private String engineBrand;
    private int seatNumber;
    private int numberOfWheel;

    public Vehicle(){

    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public Vehicle(String engineBrand, int seatNumber, int numberOfWheel) {
        this.engineBrand = engineBrand;
        this.seatNumber = seatNumber;
        this.numberOfWheel = numberOfWheel;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
