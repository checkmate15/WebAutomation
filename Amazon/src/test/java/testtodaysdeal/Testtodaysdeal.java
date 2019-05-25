package testtodaysdeal;

import base.CommonAPI;
import hamburger.Hamburger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testtodaysdeal extends CommonAPI {

    String url = "https://www.amazon.com/";
    Todaysdeal testdeals;

    @BeforeClass
    public void initialize() {
        testdeals = PageFactory.initElements(driver,Todaysdeal .class);
        driver.get(url);


    }

    @AfterClass
    public void init() {

        driver.get(url);
    }
    @Test(priority = 31)
    public void clickontodaysdeal(){
        testdeals.setTodaysdeal();
    }
    @Test(priority = 32)
    public void clickonamazondevice(){
        testdeals.setAmazondevice();
    }
    @Test(priority = 33)
    public void clickonclear(){
        testdeals.setClear();
    }
    @Test(priority = 34)
    public void clickoncamera(){
        testdeals.setCamera();
    }
    @Test(priority = 35)
    public void clickondiscount(){
        testdeals.setDiscount();
    }
    @Test(priority = 36)
    public void clickondiscountitem(){
        testdeals.setDiscountitem();
    }
    @Test(priority = 37)
    public void clickonaddtolist(){
        testdeals.setAddtolist();
    }
    @Test(priority = 38)
    public void clickonforgetpass(){
        testdeals.setForgetpass();
    }
    @Test(priority = 39)
    public void clickonenterphone(){
        testdeals.setEnterphone();
    }
    @Test(priority = 40)
    public void clickonenter(){
        testdeals.setEnter();
    }




}
