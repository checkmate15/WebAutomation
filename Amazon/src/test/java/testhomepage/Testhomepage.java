package testhomepage;

import base.CommonAPI;
import homepage.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testhomepage extends CommonAPI {
    String url ="https://www.amazon.com/";
    Homepage testamazon;



            @BeforeClass
    public void initialize(){
                testamazon = PageFactory.initElements(driver, Homepage.class);
                driver.get(url);

            }
            @AfterMethod
    public void init(){
                driver.get(url);
            }
            @Test
    public void clickonsearch(){
                testamazon.setSearch();
            }
            @Test
    public void clickonhamburger(){
                testamazon.setHamburger();
            }
            @Test
    public void clickonorderTab(){
                testamazon.setOrderTab();
            }
            @Test
    public void clickonsellTab(){
                testamazon.setSellTab();
            }
            @Test
    public void clickonregistryTab(){
                testamazon.setRegistryTab();
            }
            @Test
    public void clickonhelpTab(){
                testamazon.setHelpTab();
            }
            @Test
    public void clickongiftcards(){
                testamazon.setGiftcards();
            }
            @Test
    public void clickontodaysdeals(){
                testamazon.setTodaysdeals();
            }







}
