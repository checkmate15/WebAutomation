package testhamburger;

import base.CommonAPI;
import hamburger.Hamburger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testhamburger extends CommonAPI {

    String url = "https://www.amazon.com/";
    Hamburger testhamburger;

    @BeforeClass
    public void initialize() {
        testhamburger = PageFactory.initElements(driver,Hamburger .class);
        driver.get(url);


    }

    @AfterClass
    public void init() {

        driver.get(url);
    }

    @Test(priority = 14)
    public void clickonhamburger() {
        testhamburger.setHamburger();
    }
    @Test(priority = 15)
    public void clickonelectronics() {
        testhamburger.setElectronics();
    }
    @Test(priority = 16)
    public void clickonphones(){
        testhamburger.setPhones();
    }
    @Test(priority = 17)
    public void clickonunlockedphones(){
        testhamburger.setUnlockedphones();
    }
    @Test(priority = 18)
    public void clickonblu(){
        testhamburger.setBlu();
    }
    @Test(priority = 19)
    public void clickonblumega(){
        testhamburger.setBlumega();
    }
    @Test(priority = 20)
    public void clickonaddtocart(){
        testhamburger.setAddtocart();
    }
    @Test(priority = 21)
    public void clickonnothanks(){
        testhamburger.setNothanks();
    }
   // @Test(priority = 22)
    //public void clickoncart(){
      //  testamazon1.setCart();
    //}
    @Test(priority = 22)
    public void clickonproceed(){
        testhamburger.setProceed();
    }
    @Test(priority = 23)
    public void clickonemail(){
        testhamburger.setEmail();
    }
    @Test(priority = 24)
    public void clickonpass(){
        testhamburger.setPass();
    }
    @Test(priority = 25)
    public void clickonsignin(){
        testhamburger.setSignin();
    }
    @Test(priority = 26)
    public void clickoncreateac(){
        testhamburger.setCreateac();
    }
    @Test(priority = 27)
    public void clickonyourname(){
        testhamburger.setYourname();
    }
    @Test(priority = 28)
    public void clickonemail2(){
        testhamburger.setEmail2();
    }
    @Test(priority = 29)
    public void clickonpass2(){
        testhamburger.setPass2();
    }
    @Test(priority = 30)
    public void clickonreenterpass(){
        testhamburger.setReenterpass();
    }





}
