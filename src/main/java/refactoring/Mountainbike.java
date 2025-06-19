package refactoring;

public class Mountainbike extends Bike {

    private int maxSpeed;

    public Mountainbike(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount) {
        super(productName, price, 0, rearGearsCount, frontGearsCount);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public Integer getBatteryCapacity() {
        return null;
    }
}
