package testusahomepage;

import base.CommonAPI;
import furniturepage.FurniturePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import usahomepage.USAhomepage;

public class TestUsaHomepage extends CommonAPI {
    String url ="https://usa.alibaba.com/";
    USAhomepage testusahome;
    @BeforeClass
    public void initialize(){
        testusahome = PageFactory.initElements(driver, USAhomepage.class);
        driver.get(url);
    }
    @AfterClass
    public void navigate(){
        driver.get(url);
    }
    @Test
    public void clickagriculture(){
        testusahome.setAgriculture();
        String title =driver.getTitle();
        String actualtitle ="United States Pavilion";
        if(title.equalsIgnoreCase(actualtitle)){
            System.out.println("Passed");
        }else
            System.out.println("Failed");


    }
}
