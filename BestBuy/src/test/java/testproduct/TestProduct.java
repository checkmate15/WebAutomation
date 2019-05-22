package testproduct;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import product.Product;

public class TestProduct extends CommonAPI {
    Product testProduct;
    String url = "https://bestbuy.com";
    @BeforeClass
    public void init() throws Exception{
        testProduct = PageFactory.initElements(driver, Product.class);
        driver.get(url);
        Thread.sleep(5000);

    }
    @AfterMethod
    public void initialize(){
        driver.get(url);
    }

    @Test(priority = 34)
    public void clickOnAppliance(){
        testProduct.setAppliances();

    }

    @Test(priority = 35)
    public void clickonvideoGames(){
        testProduct.setVideogames();
    }

    @Test(priority = 36)
    public void clickOnAllplaystation(){
        testProduct.setAllplaystation();
    }

    @Test(priority = 37)
    public void chekingTitleurl(){
        testProduct.setAllplaystation();
        String title = driver.getTitle();
        System.out.println(title);

        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @Test(priority = 38)
    public void verifingTitleurl(){
        testProduct.setAllplaystation();
        String title = driver.getTitle();
        String expectedtitle = "PS4 Games and Consoles for PlayStation 4 - Best Buy";

        String url = driver.getCurrentUrl();
        String expectedUrl ="https://www.bestbuy.com/site/video-games/playstation-4-ps4/pcmcat295700050012.c?id=pcmcat295700050012";

        if (title.equalsIgnoreCase(expectedtitle)&&(url.equalsIgnoreCase(expectedUrl))){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


    }


}
