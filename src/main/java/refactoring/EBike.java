package refactoring;

public class EBike extends Bike {

    private int maxSpeed;
    private int rearGearsCount;
    private int frontGearsCount;

    public EBike(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount, int batteryCapacity) {
        super(productName, price, batteryCapacity);
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
    public int getGearsCount() {
        return rearGearsCount * frontGearsCount;
    }
}
