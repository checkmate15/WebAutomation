package testusahomepage;

import base.CommonAPI;
import furniturepage.FurniturePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import usahomepage.USAhomepage;

public class TestUsaHomepage extends CommonAPI {
    String url ="https://www.alibaba.com/";
    USAhomepage testusahome;
    @BeforeClass
    public void initialize(){
        testusahome = PageFactory.initElements(driver, USAhomepage.class);
        driver.get(url);
    }
    @AfterMethod
    public void navigate(){
        driver.get(url);
    }
    @Test
    public void clickagriculture(){
        testusahome.setAgriculture();
    }
}
