package regerssionTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.EbayClass2;
import regression.EbaySearch;

public class TestEbayClass2 extends EbayClass2 {

    EbayClass2 testEbay;
    String url = "https://www.ebay.com/";

    @BeforeClass
    public void init() throws Exception {
        testEbay = PageFactory.initElements(driver, EbayClass2.class);
        driver.get(url);
        Thread.sleep(5000);
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