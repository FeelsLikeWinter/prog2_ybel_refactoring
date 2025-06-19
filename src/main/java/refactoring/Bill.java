package refactoring;

import java.util.ArrayList;
import java.util.Date;

/**
 * This class represents a customers bill when buying a bike.
 */
public class Bill {

    private String customerName;
    private String nickname;
    private Date birthday;
    private String email;
    private String street;
    private String streetNumber;
    private int postalCode;
    private String city;
    private ArrayList<Article> articles;

    /**
     * Constructor of the Bill class.
     *
     * @param customerName
     * @param nickname
     * @param street
     * @param streetNumber
     * @param postalCode
     * @param birthday
     * @param email
     * @param city
     */
    public Bill(String customerName, String nickname, String street, String streetNumber, int postalCode,
                Date birthday, String email, String city) {
        this.customerName = customerName;
        this.nickname = nickname;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.birthday = birthday;
        this.email = email;
        this.city = city;
        articles = new ArrayList<>();
    }
    /**
     * Adds an article to the List of articles.
     *
     * @param article
     *
     * @return true if the article was successfully added
     */
    public boolean addArticle(Article article) {
        return articles.add(article);
    }
    /**
     * Return the details of this bill.
     *
     * @return a message containing the details of the bill
     */
    public String getDetails() {
        double total = 0;

        String result = "Details for \"" + customerName + "\"\n";
        result += street + " " + streetNumber + "\n";
        result += postalCode + " " + city + "\n";
        result += "Geburtstag: " + birthday + "\n";
        result += "Email: " + email + "\n\n";
        result += "refactoring.Article: \n";
        for (Article article : articles) {
            double price = article.getPrice();

            result +=
                "\t"
                    + article.getBike().getProductName()
                    + "\tx\t"
                    + article.getPurchaseAmount()
                    + "\t=\t"
                    + String.valueOf(price)
                    + "\n";
            total += price;
        }

        result += "\nTotal price:\t" + String.valueOf(total) + "\n";

        return result;
    }
    /**
     * Return the customer name.
     *
     * @return customerName
     */
    public String getCustomerName(){
        return customerName;
    }
    /**
     * Return the nickname.
     *
     * @return nickname
     */
    public String getNickname(){
        return nickname;
    }
    /**
     * Return the birthday.
     *
     * @return birthday
     */
    public Date getBirthday(){
        return birthday;
    }
    /**
     * Return the email.
     *
     * @return email
     */
    public String getEmail(){
        return email;
    }
    /**
     * Return the street.
     *
     * @return street
     */
    public String getStreet(){
        return street;
    }
    /**
     * Return the street number.
     *
     * @return streetNumber
     */
    public String getStreetNumber(){
        return streetNumber;
    }
    /**
     * Return the postal code.
     *
     * @return postalCode
     */
    public int getPostalCode(){
        return postalCode;
    }
    /**
     * Return the city.
     *
     * @return city
     */
    public String getCity(){
        return city;
    }
    /**
     * Return the articles.
     *
     * @return articles
     */
    public ArrayList<Article> getArticles(){
        return articles;
    }
}
