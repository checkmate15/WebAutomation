package testhamburger;

import base.CommonAPI;
import hamburger.Hamburger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testhamburger extends CommonAPI {

    String url = "https://www.amazon.com/";
    Hamburger testamazon1;

    @BeforeClass
    public void initialize() {
        testamazon1 = PageFactory.initElements(driver,Hamburger .class);
        driver.get(url);


    }

    @AfterClass
    public void init() {

        driver.get(url);
    }

    @Test(priority = 14)
    public void clickonhamburger() {
        testamazon1.setHamburger();
    }
    @Test(priority = 15)
    public void clickonelectronics(){
        testamazon1.setElectronics();
    }
    @Test(priority = 16)
    public void clickonphones(){
        testamazon1.setPhones();
    }
    @Test(priority = 17)
    public void clickonunlockedphones(){
        testamazon1.setUnlockedphones();
    }
    @Test(priority = 18)
    public void clickonblu(){
        testamazon1.setBlu();
    }
    @Test(priority = 19)
    public void clickonblumega(){
        testamazon1.setBlumega();
    }
    @Test(priority = 20)
    public void clickondisplay1(){
        testamazon1.setDisplay1();
    }


}
