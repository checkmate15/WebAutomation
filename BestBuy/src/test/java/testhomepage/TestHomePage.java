package testhomepage;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage testHome;
    String url ="https://www.bestbuy.com";

    @BeforeMethod
    public void init(){
        testHome = PageFactory.initElements(driver,HomePage.class);
        driver.get(url);
    }

    @Test
    public void clickOnproduct(){
        testHome.setProduct();
    }

    @Test
    public void clickonBrands(){
        testHome.setBrands();
    }


}
