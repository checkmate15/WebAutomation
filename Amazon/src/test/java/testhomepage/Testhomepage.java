package testhomepage;

import base.CommonAPI;
import homepage.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testhomepage extends CommonAPI {
    String url = "https://www.amazon.com/";
    Homepage testamazon;


    @BeforeClass
    public void initialize() {
        testamazon = PageFactory.initElements(driver, Homepage.class);
        driver.get(url);


    }

    @AfterClass
    public void init() {
        driver.get(url);

    }

    @Test(priority = 1)
    public void clickonsearch() {
        testamazon.setSearch();

    }

    @Test(priority = 2)
    public void clickonhamburger() {
        testamazon.setHamburger();
        driver.navigate().to(url);
    }

    @Test(priority = 2)
    public void clickonorderTab() {
        testamazon.setOrderTab();
        driver.navigate().to(url);
    }

    @Test(priority = 3)
    public void clickonsellTab() {
        testamazon.setSellTab();
        driver.navigate().to(url);
    }

    @Test(priority = 4)
    public void clickonregistryTab() {
        testamazon.setRegistryTab();
        driver.navigate().to(url);
    }

    @Test(priority = 5)
    public void clickonhelpTab() {
        testamazon.setHelpTab();
        driver.navigate().to(url);
    }

    @Test(priority = 6)
    public void clickongiftcards() {
        testamazon.setGiftcards();
        driver.navigate().to(url);
    }

    @Test(priority = 7)
    public void clickontodaysdeals() {
        testamazon.setTodaysdeals();
        driver.navigate().to(url);
    }

    @Test(priority = 8)
    public void clickonyourorders() {
        testamazon.setYourorders();
        driver.navigate().to(url);
    }

    @Test(priority = 9)
    public void clickontryprime() {
        testamazon.setTryprime();
        driver.navigate().to(url);
    }

    @Test(priority = 10)
    public void clickoncart() {
        testamazon.setCart();
        driver.navigate().to(url);

    }

    @Test(priority = 11)
    public void clickonaccount() {
        testamazon.setAccount();
        driver.navigate().to(url);

    }

    @Test(priority = 12)
    public void clickonyouramazon() {
        testamazon.setYouramazon();
        driver.navigate().to(url);
    }

    @Test(priority = 13)
    public void clickonshopdeals() {
        testamazon.setShopdeals();
        driver.navigate().to(url);
    }


}
