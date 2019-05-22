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
    public void clickonaddtocart(){
        testamazon1.setAddtocart();
    }
    @Test(priority = 21)
    public void clickonnothanks(){
        testamazon1.setNothanks();
    }
   // @Test(priority = 22)
    //public void clickoncart(){
      //  testamazon1.setCart();
    //}
    @Test(priority = 22)
    public void clickonproceed(){
        testamazon1.setProceed();
    }
    @Test(priority = 23)
    public void clickonemail(){
        testamazon1.setEmail();
    }
    @Test(priority = 24)
    public void clickonpass(){
        testamazon1.setPass();
    }
    @Test(priority = 25)
    public void clickonsignin(){
        testamazon1.setSignin();
    }
    @Test(priority = 26)
    public void clickoncreateac(){
        testamazon1.setCreateac();
    }
    @Test(priority = 27)
    public void clickonyourname(){
        testamazon1.setYourname();
    }
    @Test(priority = 28)
    public void clickonemail2(){
        testamazon1.setEmail2();
    }
    @Test(priority = 29)
    public void clickonpass2(){
        testamazon1.setPass2();
    }
    @Test(priority = 30)
    public void clickonreenterpass(){
        testamazon1.setReenterpass();
    }




}
