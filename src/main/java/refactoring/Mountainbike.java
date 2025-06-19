package refactoring;

/**
 * This class represents a mountain bike.
 */
public class Mountainbike extends Bike {

    private int maxSpeed;

    /**
     * The constructor of the mountain bike class.
     *
     * @param productName
     * @param price
     * @param maxSpeed
     * @param rearGearsCount
     * @param frontGearsCount
     */
    public Mountainbike(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount) {
        super(productName, price, 0, rearGearsCount, frontGearsCount);
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
    /**
     * Return that there is no battery capacity.
     *
     * @return null
     */
    @Override
    public Integer getBatteryCapacity() {
        return null;
    }
}
