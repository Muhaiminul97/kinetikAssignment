package kinetik.example.aqua1;

import kinetik.MainPage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeTest
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");

        mainPage = new MainPage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }





    @Test(priority = 2)
    public void addCart() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.addToCart.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test(priority = 3)
    public void cartPage() throws InterruptedException {
        mainPage.checkCart.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.proceedToCheckout.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test(priority = 4)
    public void newAccountSignUp() throws InterruptedException {
        mainPage.registerBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.name.click();
        mainPage.name.sendKeys("Mr.Martin");

        mainPage.email.click();
        mainPage.email.sendKeys("m@gmail.com");

        mainPage.signup.click();
    }

    @Test(priority = 5)
    public void createAccount() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.first_name.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.first_name.sendKeys("Martin");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.last_name.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.last_name.sendKeys("");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.addAddress.sendKeys("Dhaka");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.country.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.selectCountry.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.state.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.state.sendKeys("Torento");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.city.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.city.sendKeys("Torento");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.zipcode.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.zipcode.sendKeys("1399");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.mobileNumber.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.mobileNumber.sendKeys("+129939393");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.createAccount.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.continueAccount.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.checkCart.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage.placeOrder.click();

    }
}
