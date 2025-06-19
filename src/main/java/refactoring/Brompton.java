package refactoring;

/**
 * This class represents a brompton bike.
 */
public class Brompton extends Bike {

    private int maxSpeed;

    /**
     * The constructor of the brompton class.
     *
     * @param productName
     * @param price
     * @param maxSpeed
     * @param rearGearsCount
     * @param frontGearsCount
     */
    public Brompton(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount) {
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
