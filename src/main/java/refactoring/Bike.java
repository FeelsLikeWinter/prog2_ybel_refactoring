package refactoring;

public class Bike {

    protected String productName;
    protected double price;
    protected Integer batteryCapacity;
    private int rearGearsCount;
    private int frontGearsCount;

    public Bike (String productName, double price, Integer batteryCapacity, int rearGearsCount, int frontGearsCount){
        this.productName = productName;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
        this.rearGearsCount = rearGearsCount;
        this.frontGearsCount = frontGearsCount;
    }
    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public int getRearGearsCount(){
        return rearGearsCount;
    }
    public int getFrontGearsCount(){
        return frontGearsCount;
    }
    public int getGearsCount() {
        return rearGearsCount * frontGearsCount;
    }
}
