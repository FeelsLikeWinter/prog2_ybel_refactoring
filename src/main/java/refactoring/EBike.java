package refactoring;

public class EBike extends Bike {

    private int maxSpeed;

    public EBike(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount, int batteryCapacity) {
        super(productName, price, batteryCapacity, rearGearsCount, frontGearsCount);
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
