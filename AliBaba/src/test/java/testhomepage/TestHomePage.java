package testhomepage;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    HomePage testalibaba;
    String url ="https://www.alibaba.com/";


    @BeforeClass
    public void initialize(){
        testalibaba = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }
    @AfterClass
    public void init(){
        driver.get(url);
    }
    @Test
    public void clickonsignIn(){
        testalibaba.setSingIn();
    }
    @Test
    public void clickhomegurden(){
        testalibaba.setHomegurden();
    }
    @Test
    public void clickgiftcarfts(){
        testalibaba.setGiftcarfts();
    }
    @Test
    public void clickfurniture(){
        testalibaba.setFurniture();
    }
    @Test
    public void clicklights(){
        testalibaba.setLights();
    }
    @Test
    public void clickvehicles(){
        testalibaba.setVehicles();
    }
    @Test
    public void clicktextiles(){
        testalibaba.setTextiles();
    }
    @Test
    public void clickconstruction(){
        testalibaba.setConstruction();
    }
    @Test
    public void clickindusmechinery(){
        testalibaba.setIndustrialmachinery();
    }


}