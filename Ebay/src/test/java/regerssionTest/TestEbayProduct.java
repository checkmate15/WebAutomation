package regerssionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.EbayProduct;

public class TestEbayProduct extends CommonAPI {

    EbayProduct testEbay;
    String url = "https://www.ebay.com/";

    @BeforeClass
    public void init() throws Exception {
        testEbay = PageFactory.initElements(driver, EbayProduct.class);
        driver.get(url);
        Thread.sleep(5000);
    }
    @AfterMethod
    public void initialize() {
        driver.get(url);

    }

    @Test(priority = 2)
    public void clickOnFashion() {
        testEbay.setFashion();

    }

    @Test(priority = 4)
    public void clickOnDresses() {
        testEbay.setDresses();

    }
    @Test(priority = 5)
    public void checkingShoes() {
        testEbay.setShoes();

    }
    @Test(priority = 6)
    public void clickOnJewelry() {
        testEbay.setJewelry();

    }
    @Test(priority = 7)
    public void clickOnWatches() {
        testEbay.setWatches();


    }
    @Test(priority = 0)
    public void clickOnGiftCards() {
        testEbay.setGiftCards();


    }
    @Test(priority = 1)
    public void clickOnCoupons() {
        testEbay.setCoupons();
        driver.navigate().to(url);
    }


}

