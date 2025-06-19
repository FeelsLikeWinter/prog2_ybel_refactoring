package refactoring;

public class Brompton extends Bike {

    private int maxSpeed;
    private int rearGearsCount;
    private int frontGearsCount;

    public Brompton(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount) {
        super(productName, price, 0);
        this.maxSpeed = maxSpeed;
        this.rearGearsCount = rearGearsCount;
        this.frontGearsCount = frontGearsCount;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getRearGearsCount(){
        return rearGearsCount;
    }
    public int getFrontGearsCount(){
        return frontGearsCount;
    }

    @Override
    public Integer getBatteryCapacity() {
        return null;
    }

    @Override
    public int getGearsCount() {
        return rearGearsCount * frontGearsCount;
    }
}
