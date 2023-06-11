package kinetik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.jetbrains.com/
public class MainPage {
    @FindBy(xpath = "//section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]")
    public WebElement addToCart;

    @FindBy(xpath = "//u[contains(text(),'View Cart')]")
    public WebElement cart;

    @FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//u[contains(text(),'Register / Login')]")
    public WebElement registerBtn;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")
    public WebElement email;

    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    public WebElement signup;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement genderSelection;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement selectDays;

    @FindBy(id = "months")
    public WebElement selectMonths;

    @FindBy(id = "years")
    public WebElement selectYears;

    @FindBy(id = "first_name")
    public WebElement first_name;

    @FindBy(id = "last_name")
    public WebElement last_name;

    @FindBy(id = "address1")
    public WebElement addAddress;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(xpath = "//option[contains(text(),'Canada')]")
    public WebElement selectCountry;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "zipcode")
    public WebElement zipcode;

    @FindBy(id = "mobile_number")
    public WebElement mobileNumber;


    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    public WebElement createAccount;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public WebElement continueAccount;

    @FindBy(xpath = "//div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    public WebElement checkCart;

    @FindBy(xpath = "//a[contains(text(),'Place Order')]")
    public WebElement placeOrder;

    @FindBy(xpath = "//section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
    public WebElement nameCard;

    @FindBy(className = "card_number")
    public WebElement card_number;

    @FindBy(className = "card-cvc")
    public WebElement cvc;

    @FindBy(className = "card-expiry-month")
    public WebElement cardExpiryMonth;

    @FindBy(className = "card-expiry-year")
    public WebElement cardExpiryYear;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement payOrder;

    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your order has been confirmed!')]")
    public WebElement orderConfirmation;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
