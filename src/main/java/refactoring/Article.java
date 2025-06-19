package refactoring;

public class Article {

    private Bike bike;
    private int purchaseAmount;

    public Article(Bike bike, int purchaseAmount) {
        this.bike = bike;
        this.purchaseAmount = purchaseAmount;
    }
    public Bike getBike(){
        return bike;
    }
    public int getPurchaseAmount(){
        return purchaseAmount;
    }
    public double getPrice() {
        double price = 0;
        if (getBike() instanceof Brompton) {
            if (getPurchaseAmount() > 1) {
                price += (getPurchaseAmount() - 1) * getBike().getPrice() / 2;
            }
            price += getBike().getPrice() * getPurchaseAmount();
        } else if (getBike() instanceof EBike) {
            price += getBike().getPrice() * getPurchaseAmount();
        } else if (getBike() instanceof Mountainbike) {
            if (getPurchaseAmount() > 2) {
                price += getPurchaseAmount() * getBike().getPrice() * 9 / 10;
            } else {
                price += getBike().getPrice() * getPurchaseAmount();
            }
        }
        if (price > 1000f || price == 1000.0) {
            price = price * 0.8;
        }
        return price;
    }
}
