package testfurniturepage;

import base.CommonAPI;
import furniturepage.FurniturePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import signin.SugnIn;

import java.util.Properties;

public class TestFurniturePage extends CommonAPI {
    FurniturePage testfurniturepage;
    String url ="https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.201703.7.2ce265aaURRrYi";


    @BeforeClass
    public void initialize(){
        testfurniturepage = PageFactory.initElements(driver, FurniturePage.class);
        driver.get(url);
    }
    @AfterMethod
    public void navigate(){
        driver.navigate().to(url);
    }


    /*@Test(priority = 1)
    public void clickbedroom() {
        testfurniturepage.setBedroom();
        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div[1]/div/ul/li[1]/a/div[2]")).click();


    }*/
    @Test(priority = 1)

    public void setantiquefurniture(){
        WebElement element = driver.findElement(By.linkText("Antique Furniture"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Antique Beds")).click();


    }
    @Test(priority = 2)
    public void setcoomercialfurniture() {
        WebElement element = driver.findElement(By.linkText("Commercial Furniture"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Hotel Furniture")).click();


    }
    @Test(priority = 3)
    public void searchforbeds(){
        testfurniturepage.setSearch("beds");

    }









    }


