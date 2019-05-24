package testbrands;

import base.CommonAPI;
import brands.Brands;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBrands extends CommonAPI {
    Brands testBrands;
    String url = "https://bestbuy.com";

    @BeforeClass
    public void init() throws Exception {
        testBrands = PageFactory.initElements(driver, Brands.class);
        driver.get(url);
        Thread.sleep(5000);

    }

    @AfterMethod
    public void initialize() {
        driver.get(url);
    }

    @Test(priority = 39)
    public void clickSamsung() {
        testBrands.setSamsung();
    }

    @Test(priority = 40)
    public void checkPagesource() {
        testBrands.setpageSource();
    }

    @Test(priority = 41)
    public void checksmartHome() {
        testBrands.setSmarthome();
    }

    @Test(priority = 42)
    public void verifiedsmarthome() {
        testBrands.setsmarttitle();
    }

    @Test(priority = 43)
    public void backforward() {
        testBrands.setSmarthome();
        navigateBack();
        navigateForward();
    }
}