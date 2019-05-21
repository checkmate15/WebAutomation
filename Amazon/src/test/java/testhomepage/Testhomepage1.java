package testhomepage;

import base.CommonAPI;
import homepage.Homepage1;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testhomepage1 extends CommonAPI {
    String url = "https://www.amazon.com/";
    Homepage1 testamazon1;

    @BeforeClass
    public void initialize() {
        testamazon1 = PageFactory.initElements(driver, Homepage1.class);
        driver.get(url);


    }

    @AfterClass
    public void init() {
        driver.get(url);
    }

    @Test
    public void clickonhamburger() {
        testamazon1.setHamburger();
    }
    @Test
    public void clickonelectronics(){
        testamazon1.setElectronics();
    }


    }


