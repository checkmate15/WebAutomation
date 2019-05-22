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
    @Test(priority = 34)
    public void clickoncamera(){
        testamazon2.setCamera();
    }
    @Test(priority = 35)
    public void clickondiscount(){
        testamazon2.setDiscount();
    }
    @Test(priority = 36)
    public void clickondiscountitem(){
        testamazon2.setDiscountitem();
    }
    @Test(priority = 37)
    public void clickonaddtolist(){
        testamazon2.setAddtolist();
    }
    @Test(priority = 38)
    public void clickonforgetpass(){
        testamazon2.setForgetpass();
    }
    @Test(priority = 39)
    public void clickonenterphone(){
        testamazon2.setEnterphone();
    }
    @Test(priority = 40)
    public void clickonenter(){
        testamazon2.setEnter();
    }




}
