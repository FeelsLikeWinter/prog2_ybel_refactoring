package refactoring;

/**
 * This class represents the overall bike.
 */
public class Bike {

    protected String productName;
    protected double price;
    protected Integer batteryCapacity;
    private int rearGearsCount;
    private int frontGearsCount;

    /**
     * Constructor of the bike class.
     *
     * @param productName
     * @param price
     * @param batteryCapacity
     * @param rearGearsCount
     * @param frontGearsCount
     */
    public Bike (String productName, double price, Integer batteryCapacity, int rearGearsCount, int frontGearsCount){
        this.productName = productName;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
        this.rearGearsCount = rearGearsCount;
        this.frontGearsCount = frontGearsCount;
    }

    /**
     * Return the battery capacity.
     *
     * @return batteryCapacity
     */
    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Return the product name.
     *
     * @return productName
     */
    public String getProductName(){
        return productName;
    }

    /**
     * Return the price.
     *
     * @return price
     */
    public double getPrice(){
        return price;
    }

    /**
     * Return the rear gears count.
     *
     * @return rearGearsCount
     */
    public int getRearGearsCount(){
        return rearGearsCount;
    }

    /**
     * Return the front gears count.
     *
     * @return frontGearsCount
     */
    public int getFrontGearsCount(){
        return frontGearsCount;
    }

    /**
     * Return the overall gears count.
     *
     * @return the product of the front and rear gears count
     */
    public int getGearsCount() {
        return rearGearsCount * frontGearsCount;
    }
}
