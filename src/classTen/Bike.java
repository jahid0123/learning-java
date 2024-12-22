package classTen;

public class Bike extends Vehicle{
    private boolean isHasStand;
    private boolean isHasChainDrive;

    public Bike() {
    }

    public Bike(boolean isHasStand, boolean isHasChainDrive) {
        this.isHasStand = isHasStand;
        this.isHasChainDrive = isHasChainDrive;
    }

    public Bike(String engineBrand, int seatNumber, int numberOfWheel, boolean isHasStand, boolean isHasChainDrive) {
        super(engineBrand, seatNumber, numberOfWheel);
        this.isHasStand = isHasStand;
        this.isHasChainDrive = isHasChainDrive;
    }

    public boolean isHasStand() {
        return isHasStand;
    }

    public void setHasStand(boolean hasStand) {
        isHasStand = hasStand;
    }

    public boolean isHasChainDrive() {
        return isHasChainDrive;
    }

    public void setHasChainDrive(boolean hasChainDrive) {
        isHasChainDrive = hasChainDrive;
    }
}
