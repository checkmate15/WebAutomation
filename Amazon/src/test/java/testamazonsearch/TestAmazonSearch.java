package testamazonsearch;

import amazonsearch.AmazonSearch;
import base.CommonAPI;
import hamburger.Hamburger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAmazonSearch extends CommonAPI {

    String url = "https://www.amazon.com/";
    AmazonSearch testsearch;

    @BeforeClass
    public void initialize() throws Exception {
        testsearch = PageFactory.initElements(driver,AmazonSearch .class);
        driver.get(url);


    }

    @AfterClass
    public void init() {

        driver.get(url);

    }
//    @Test(priority = 41)
//    public void clickonsearchbutton(){
//        testsearch.setSearchButton("iphones");
//    }
//    @Test(priority = 42)
//    public void clickongo(){
//        testsearch.setGo();
//        driver.navigate().to(url);
//    }
//    @Test(priority = 43)
//    public void clickonsearch(){
//        testsearch.setSearch();
//    }
    @Test(priority = 44)
    public void clickontype()  {
        testsearch.settype("samsung");

    }
//    @Test(priority = 45)
//    public void clickonrun() {
//        testsearch.setRun();
//    }




}
