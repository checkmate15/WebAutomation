package regerssionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.EbayDeals;
import regression.EbaySearch;

public class TestEbayDeals extends CommonAPI {

    EbayDeals testEbayDeals;
    String url = "https://www.ebay.com/";

    @BeforeClass
    public void init() throws Exception {
        testEbayDeals = PageFactory.initElements(driver, EbayDeals.class);
        driver.get(url);
    }

    @Test
    public void clickOnsDeals() {
        testEbayDeals.setDeals();
        navigateBack();

    }

}