package testsignin;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import signin.SugnIn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class TestSignIn extends CommonAPI {
    SugnIn testsignin;
    String url ="https://www.alibaba.com/";


    @BeforeClass
    public void initialize(){
        testsignin = PageFactory.initElements(driver, SugnIn.class);
        driver.get(url);
    }
    @AfterClass
    public void init(){
        driver.get(url);



    }
    @Test
    public void setTestsignin(){
        WebElement element = driver.findElement(By.linkText("My Alibaba"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Sign In")).click();

        sleepFor(5);





        }



    }




