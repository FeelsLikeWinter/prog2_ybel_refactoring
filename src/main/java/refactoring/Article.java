package refactoring;

/**
 * This class represents a purchasable article of a bike.
 */
public class Article {

    private Bike bike;
    private int purchaseAmount;

    /**
     * Constructor of the article class.
     *
     * @param bike
     * @param purchaseAmount
     */
    public Article(Bike bike, int purchaseAmount) {
        this.bike = bike;
        this.purchaseAmount = purchaseAmount;
    }

    /**
     * Return the bike.
     *
     * @return bike
     */
    public Bike getBike(){
        return bike;
    }

    /**
     * Return the purchased amount.
     *
     * @return purchaseAmount
     */
    public int getPurchaseAmount(){
        return purchaseAmount;
    }

    /**
     * Calculate the price for this type of bike.
     *
     * @return price of the bike
     */
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
