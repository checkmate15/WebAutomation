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

    @Test(priority = 1)
    public void clickonhamburger() {
        testamazon1.setHamburger();
    }
    @Test(priority = 2)
    public void clickonelectronics(){
        testamazon1.setElectronics();
    }
    @Test(priority = 3)
    public void clickonphones(){
        testamazon1.setPhones();
    }


}
