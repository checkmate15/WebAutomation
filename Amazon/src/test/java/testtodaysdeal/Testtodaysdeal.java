package testtodaysdeal;

import base.CommonAPI;
import hamburger.Hamburger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testtodaysdeal extends CommonAPI {

    String url = "https://www.amazon.com/";
    Todaysdeal testamazon2;

    @BeforeClass
    public void initialize() {
        testamazon2 = PageFactory.initElements(driver,Todaysdeal .class);
        driver.get(url);


    }

    @AfterClass
    public void init() {

        driver.get(url);
    }
    @Test(priority = 31)
    public void clickontodaysdeal(){
        testamazon2.setTodaysdeal();
    }
    @Test(priority = 32)
    public void clickonamazondevice(){
        testamazon2.setAmazondevice();
    }
    @Test(priority = 33)
    public void clickonclear(){
        testamazon2.setClear();
    }


}
