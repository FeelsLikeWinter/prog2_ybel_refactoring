package refactoring;

public class Bike {

    protected String productName;
    protected double price;
    protected Integer batteryCapacity;

    public Bike (String productName, double price, Integer batteryCapacity){
        this.productName = productName;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
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
    public int getGearsCount() {
        throw new UnsupportedOperationException("Not Implemented");
    }
}
