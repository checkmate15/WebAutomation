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
    public void clickcategoris(){

        testalibaba.setCategoris();

    }
    @Test
    public void clicktradeshow(){
        testalibaba.setTradeshows();
    }
    @Test
    public void clickgetapp(){
        testalibaba.setGetapp();


    }
    @Test
    public void clicklanguage(){
        testalibaba.setLanguage();
        //TestHomePage.captureScreenshot(driver, "1st try");
    }
    @Test
    public void clicksolutions(){
        testalibaba.setSourcingSolution();
    }
    @Test
    public void clcikonmembership(){
        testalibaba.setServiceandmembership();
    }
    @Test
    public void  clickonhelp(){
        testalibaba.setHelpcommuinity();
    }
    @Test
    public void checkproducts(){
        testalibaba.setProducts();
    }
    @Test
    public void clickonsearch() throws Exception{
        testalibaba.setSearch("smart phone");
        driver.navigate().to(url);
    }
    @Test
    public void clickapparel(){
        testalibaba.setApparel();
    }
    @Test
    public void clickshoes(){
        testalibaba.setShoes();
    }
    @Test
    public void clicksports(){
        testalibaba.setSports();
    }
    @Test
    public void clickhomekicthen(){
        testalibaba.setHomekicthen();

    }
    @Test
    public void clickjacket(){
        testalibaba.setJacket();

    }
    @Test
    public void clickhuwaweimobile(){
        testalibaba.setHuwaeimobile();
        driver.navigate().to(url);
    }
    @Test
    public void checkSphone(){
        testalibaba.setSphone();
        driver.navigate().to(url);
    }
    @Test
    public void clickearpod(){
        testalibaba.setEarpod();
        driver.navigate().to(url);
    }
    @Test
    public void searchfor(){
        testalibaba.setSearchh("ball");
        driver.navigate().to(url);
    }
    @Test
    public void clickindea(){
        testalibaba.setIndea();
        driver.navigate().to(url);
    }
    @Test
    public void clickvietnum(){
        testalibaba.setVietnum();
        driver.navigate().to(url);
    }

    /*@Test
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
    }*/


}