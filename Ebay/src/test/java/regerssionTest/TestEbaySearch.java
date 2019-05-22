package regerssionTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.EbaySearch;
import reporting.TestLogger;

public class TestEbaySearch extends CommonAPI {


    EbaySearch testEbay;
    String url = "https://www.ebay.com/";

    @BeforeClass
    public void init() throws Exception {
        testEbay = PageFactory.initElements(driver, EbaySearch.class);
        driver.get(url);
        Thread.sleep(5000);
    }

    @Test(priority = 0)
    public void clickOnShopByCategory() {
        testEbay.setShopByCategory();

    }
    @Test(priority = 1)
    public void clickOnSignIn() {
        testEbay.setSignIn();

    }
    @Test(priority = 2)
    public void clickOnUserName() {
        testEbay.setUserName();

    }

    @Test(priority = 3)
    public void CheckOnPassWord() {
        testEbay.setPassWord();

    }

    @Test(priority = 4)
    public void clickOnSignInButton() {
        testEbay.setSignInButton();

    }
    @Test(priority = 5)
    public void clickOnCreateAnAccount() {
        testEbay.setcreateAnAccount();

    }

    @Test(priority = 6)
    public void clickOnFirstName() {
        testEbay.setFirstName();

    }

    @Test(priority = 7)
    public void clickOnLastName() {
        testEbay.setLastName();
    }
    @Test(priority = 8)
    public void clickOnEmail() {
        testEbay.setEmail();

    }
    @Test(priority = 9)
    public void clickOnPassword() {
        testEbay.setPassword();
        driver.navigate().to(url);

    }
    @Test(priority = 10)
    public void clickOnSearchButton() {
        testEbay.setSearchButton("lapTop");

    }
    @Test(priority = 11)
    public void clickOnSearchItems1()throws Exception {
        testEbay.setSearchItem("iPhone");
        driver.navigate();
    }
    @Test(priority = 12)
    public void SearchItems2()throws Exception{
        testEbay.setSearchItem("Bag");
        driver.navigate().to(url);
    }

    @Test(priority = 13)
    public void SearchItems3()throws Exception{
        testEbay.setSearchItem("Books");
        driver.navigate().to(url);
    }

    @Test(priority = 15)
    public void clickOnAllCategories(){
        testEbay.setAllCategories();
        driver.navigate().to(url);


    }
    @Test(priority = 16)
    public void clickOnMotors() {
        testEbay.setMotors();
        driver.navigate().to(url);

    }

    @Test(priority = 17)
    public void clickOnFashion() {
        testEbay.setFashion();
        driver.navigate().to(url);


    }

    @Test(priority = 18)
    public void clickElectronicsOn(){
        testEbay.setElectronics();
        driver.navigate().to(url);

    }

    @Test(priority = 19)
    public void clickOnCollectiblesAndArt() {
        testEbay.setCollectiblesAndArt();
        driver.navigate().to(url);

    }

    @Test(priority = 20)
    public void clickOnHomeAndGarden() {
        testEbay.setHomeAndGarden();
        driver.navigate().to(url);

    }
    @Test(priority = 21)
    public void clickOnSportingGoods() {
        testEbay.setSportingGoods();
        driver.navigate().to(url);


    }
    @Test(priority = 22)
        public void clickOnToysAndHobbies(){
            testEbay.setToysAndHobbies();
        driver.navigate().to(url);

    }
    @Test(priority = 23)
    public void clickOnBusinessAndIndustrial() {
        testEbay.setBusinessAndIndustrial();
        driver.navigate().to(url);

    }
    @Test(priority = 24)
    public void clickOnMusic() {
        testEbay.setMusic();


    }



    }





