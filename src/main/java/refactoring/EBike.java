package refactoring;

/**
 * This class represents an ebike.
 */
public class EBike extends Bike {

    private int maxSpeed;

    /**
     * The constructor of the ebike class.
     *
     * @param productName
     * @param price
     * @param maxSpeed
     * @param rearGearsCount
     * @param frontGearsCount
     * @param batteryCapacity
     */
    public EBike(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount, int batteryCapacity) {
        super(productName, price, batteryCapacity, rearGearsCount, frontGearsCount);
        this.maxSpeed = maxSpeed;
    }

    /**
     * Return the max speed.
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
