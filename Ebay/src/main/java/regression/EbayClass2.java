package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.util.logging.XMLFormatter;

public class EbayClass2 extends CommonAPI {

    WebDriver driver;
    @BeforeMethod

       public void EbatClass2(){

           System.out.println(driver.getTitle());
           System.out.println(driver.getCurrentUrl());

        }
        public void Motors(){
           driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")).sendKeys("Motors");
           driver.findElement(By.xpath("//*[@id=\"w5-w0-0-CAR_AND_TRUCK-tab\"]/span")).sendKeys("car and Trucks");

        }

    }
