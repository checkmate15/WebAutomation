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

    @Test
    public void clickonDeals(){
        testHome.setDeals();
    }

    @Test
    public void clickonServices(){
        testHome.setServices();
    }

    @Test
    public void clickonAccount(){
        testHome.setAccount();
    }

    @Test
    public void clickonShoppingHistory(){
        testHome.setShoppingHistory();
    }

    @Test
    public void clickonOrderStatus(){
        testHome.setOrderStatus();
    }

    @Test
    public void clickonSavedIteams(){
        testHome.setSavedItem();
    }

    @Test
    public void clickonTodaysDeal(){
        testHome.setTodaysDeal();
    }
    @Test
    public void clickonGiftCard(){
        testHome.setGiftCard();
    }
    @Test
    public void clickonCareers(){
        testHome.setCareers();
    }


}
