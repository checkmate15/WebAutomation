package regerssionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.EbayDeals;

public class TestEbayDeals extends CommonAPI {

    EbayDeals testEbayDeals;
    String url = "https://www.ebay.com/";

    @BeforeClass
    public void init() throws Exception {
        testEbayDeals = PageFactory.initElements(driver, EbayDeals.class);
        driver.get(url);
        Thread.sleep(3000);

    }

    @AfterMethod
    public void initialize() {
        driver.get(url);

    }

    @Test(priority = 0)
    public void clickOnsDeals() {
        testEbayDeals.setDeals();
        navigateBack();

    }

    @Test(priority = 1)
    public void clickFeatured() {
        testEbayDeals.setFeatured();
    }

    @Test(priority = 2)
    public void clickTech() {
        testEbayDeals.setTech();
    }

    @Test(priority = 3)
    public void checksCellPhones() {
        testEbayDeals.setCellPhones();
    }

    @Test(priority = 4)
    public void checkLaptopsAndNetbooks() {
        testEbayDeals.setLaptopsAndNetbooks();

    }

    @Test(priority = 5)
    public void clickCamerasAndPhoto() {
        testEbayDeals.setCamerasAndPhoto();

    }

    @Test(priority = 6)
    public void clickVideoGamesAndConsoles() {
        testEbayDeals.setLaptopsAndNetbooks();

    }

    @Test(priority = 7)
    public void clickFashion() {
        testEbayDeals.setFashion();

    }

    @Test(priority = 8)
    public void clickMensShoes() {
        testEbayDeals.setMensShoes();

    }

    @Test(priority = 9)
    public void clickWomensShoes() {
        testEbayDeals.setWomensShoes();

    }

    @Test(priority = 10)
    public void clickWatches() {
        testEbayDeals.setWatches();

    }

    @Test(priority = 11)
    public void chickMensClothing() {
        testEbayDeals.setMensClothing();
    }

    @Test(priority = 12)
    public void clickWomensClothing() {
        testEbayDeals.setWomensClothing();
    }

    @Test(priority = 13)
    public void clickFineJewelry() {
        testEbayDeals.setFineJewelry();
    }

    @Test(priority = 14)
    public void clickBeauty() {
        testEbayDeals.setBeauty();
    }

    @Test(priority = 15)
    public void clickHealth() {
        testEbayDeals.setHealth();
    }

    @Test(priority = 16)
    public void clickHomeAndGarden() {
        testEbayDeals.setHomeAndGarden();
    }

    @Test(priority = 17)
    public void clickSportingGoods() {
        testEbayDeals.setSportingGoods();

    }

    @Test(priority = 18)
    public void clickAutomotive() {
        testEbayDeals.setAutomotive();

    }

    @Test(priority = 19)
    public void clickOtherDeals() {
        testEbayDeals.setOtherDeals();

    }


}