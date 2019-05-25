package testhomepage;

import base.CommonAPI;
import homepage.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testhomepage extends CommonAPI {
    String url = "https://www.amazon.com/";
    Homepage  testhomepage;


    @BeforeClass
    public void initialize() {
        testhomepage = PageFactory.initElements(driver, Homepage.class);
        driver.get(url);


    }

    @AfterClass
    public void init() {
        driver.get(url);

    }

    @Test(priority = 1)
    public void clickonsearch() {
        testhomepage.setSearch();

    }

    @Test(priority = 2)
    public void clickonhamburger() {
        testhomepage.setHamburger();
        driver.navigate().to(url);
    }

    @Test(priority = 2)
    public void clickonorderTab() {
        testhomepage.setOrderTab();
        driver.navigate().to(url);
    }

    @Test(priority = 3)
    public void clickonsellTab() {
        testhomepage.setSellTab();
        driver.navigate().to(url);
    }

    @Test(priority = 4)
    public void clickonregistryTab() {
        testhomepage.setRegistryTab();
        driver.navigate().to(url);
    }

    @Test(priority = 5)
    public void clickonhelpTab() {
        testhomepage.setHelpTab();
        driver.navigate().to(url);
    }

    @Test(priority = 6)
    public void clickongiftcards() {
        testhomepage.setGiftcards();
        driver.navigate().to(url);
    }

    @Test(priority = 7)
    public void clickontodaysdeals() {
        testhomepage.setTodaysdeals();
        driver.navigate().to(url);
    }

    @Test(priority = 8)
    public void clickonyourorders() {
        testhomepage.setYourorders();
        driver.navigate().to(url);
    }

    @Test(priority = 9)
    public void clickontryprime() {
        testhomepage.setTryprime();
        driver.navigate().to(url);
    }

    @Test(priority = 10)
    public void clickoncart() {
        testhomepage.setCart();
        driver.navigate().to(url);

    }

    @Test(priority = 11)
    public void clickonaccount() {
        testhomepage.setAccount();
        driver.navigate().to(url);

    }

    @Test(priority = 12)
    public void clickonyouramazon() {
        testhomepage.setYouramazon();
        driver.navigate().to(url);
    }

    @Test(priority = 13)
    public void clickonshopdeals() {
        testhomepage.setShopdeals();
        driver.navigate().to(url);
    }


}
