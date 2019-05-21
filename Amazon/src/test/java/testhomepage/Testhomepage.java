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

    @Test
    public void clickonsearch() {
        testamazon.setSearch();

    }

    @Test
    public void clickonhamburger() {
        testamazon.setHamburger();
        navigateBack();
    }

    @Test
    public void clickonorderTab() {
        testamazon.setOrderTab();
        navigateBack();
    }

    @Test
    public void clickonsellTab() {
        testamazon.setSellTab();
        navigateBack();
    }

    @Test
    public void clickonregistryTab() {
        testamazon.setRegistryTab();
        navigateBack();
    }

    @Test
    public void clickonhelpTab() {
        testamazon.setHelpTab();
        navigateBack();
    }

    @Test
    public void clickongiftcards() {
        testamazon.setGiftcards();
        navigateBack();
    }

    @Test
    public void clickontodaysdeals() {
        testamazon.setTodaysdeals();
        navigateBack();
    }

    @Test
    public void clickonyourorders() {
        testamazon.setYourorders();
        driver.navigate().to(url);
    }

    @Test
    public void clickontryprime() {
        testamazon.setTryprime();
        navigateBack();
    }

    @Test
    public void clickoncart() {
        testamazon.setCart();
        navigateBack();

    }

    @Test
    public void clickonaccount() {
        testamazon.setAccount();
        driver.navigate().to(url);

    }

    @Test
    public void clickonyouramazon() {
        testamazon.setYouramazon();
        driver.navigate().to(url);
    }

    @Test
    public void clickonshopdeals() {
        testamazon.setShopdeals();
        navigateBack();
    }


}
