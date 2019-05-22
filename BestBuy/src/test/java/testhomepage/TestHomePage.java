package testhomepage;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class TestHomePage extends CommonAPI {
    HomePage testHome;
    String url = "https://bestbuy.com";

    @BeforeClass
    public void init() throws Exception{
        testHome = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
        Thread.sleep(5000);

    }
    @AfterMethod
    public void initialize(){
        driver.get(url);
    }


    @Test (priority = 1)
    public void gettitleandurl(){
        driver.navigate().to(url);
        String MainTitle = driver.getTitle();
        System.out.println(MainTitle);

        String MainUrl = driver.getCurrentUrl();
        System.out.println(MainUrl);
    }

    @Test
    public void alert(){
        driver.findElement(By.xpath("//*[@class='close']")).click();

    }

    @Test (priority = 2)
    public void validatetitleandurl(){
        driver.navigate().to(url);
        String MainTitle = driver.getTitle();
        String expectedT = "Best Buy | Official Online Store | Shop Now & Save";

        String MainUrl = driver.getCurrentUrl();
        String expectedU = "https://www.bestbuy.com/";

        if ((MainTitle.equalsIgnoreCase(expectedT))&&(MainUrl.equalsIgnoreCase(expectedU))){
            System.out.println("url and title validate passed");
        }else{
            System.out.println("Failed to vaidate");
        }
    }

    @Test (priority = 3)
    public void pagesource(){
        String source = driver.getPageSource();
        System.out.println(source);
    }

    @Test (priority = 4)
    public void clickOnproduct() {
        testHome.setProduct();
    }

    @Test (priority = 5)
    public void inproduct() {
        testHome.setProduct();
        driver.findElement(By.xpath("//*[@id='level2Menu0']/a[1]")).click();
        driver.findElement(By.xpath("//*[@id='level2Group0']/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();


    }

    @Test (priority = 6)
    public void checkproduct() {
        testHome.setProduct();
        String checktext = driver.findElement(By.xpath("//*[@id='group0']/div[4]/div[1]/ul[1]/li[1]/a[1]/span[2]")).getText();
        System.out.println(checktext);
    }





    @Test (priority = 7)
    public void clickonBrands() {
        testHome.setBrands();
    }

    @Test (priority = 8)
    public void checkBrands() {
        testHome.setBrands();
        driver.findElement(By.xpath("//*[@id='group1']/div[1]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id='site-control-content']/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]/h2[1]")).click();
        driver.findElement(By.xpath("//*[@class='btn btn-primary btn-sm btn-block btn-leading-ficon add-to-cart-button']")).click();
        driver.findElement(By.xpath("//*[@id='header']/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();

        if (driver.findElement(By.xpath("//*[@id='cartApp']/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).isDisplayed())
        System.out.println("cart checking Passed");



    }

    @Test (priority = 9)
    public void clickonDeals() {
        testHome.setDeals();

    }

    @Test (priority = 10)
    public void validateDeals() {
        testHome.setDeals();
        if (driver.findElement(By.xpath("//*[@id='group2']/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")).isDisplayed()){
            System.out.println("image displayed");

        }else{
            System.out.println("failed");
        }

    }

    @Test (priority = 11)
    public void checkingDeals() {
        testHome.setDeals();
        driver.findElement(By.xpath("//*[@id='group2']/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id='d2356979-d87d-4c30-96f6-19df27858dfd']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/h3[1]/a[1]")).click();
        String dealurl = driver.getCurrentUrl();
        System.out.println(dealurl);

    }

    @Test (priority = 12)
    public void clickonServices() {
        testHome.setServices();
    }

    @Test (priority = 13)
    public void checkingServices() {
        testHome.setServices();
        driver.findElement(By.xpath("//*[@id='group3']/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();

        String serviceurl = driver.getCurrentUrl();
        System.out.println(serviceurl);
    }

    @Test(priority = 14)
    public void clickonAccount() {
        testHome.setAccount();

    }
    @Test(priority = 15)
    public void clickonButton() {
        testHome.setAccount();
        driver.findElement(By.xpath("//*[@id=\"account-menu-app\"]/div[1]/div[2]/div[1]/div[1]/a[1]/button[1]")).click();
        String newurl = driver.getCurrentUrl();
        String expectedurl = "https://www.bestbuy.com/identity/signin?token=tid%3Afaa8cc3e-7ba4-11e9-baaf-005056ae5cbe";

        if(newurl.equalsIgnoreCase(expectedurl))
            System.out.println("Sign in page Passed");


    }

    @Test(priority = 16)
    public void clickonGiftCard() {
        testHome.setGiftCard();
    }

    @Test (priority = 17)
    public void moreGiftCard() {
        testHome.setGiftCard();

        String textm = driver.findElement(By.xpath("//*[@id='site-control-content']/div[3]/h1[1]")).getText();

        System.out.println(textm);
    }

    @Test (priority = 18)
    public void imageVerifyGiftCard() {
        testHome.setGiftCard();

        if (driver.findElement(By.xpath("//*[@id='widget-b07d77fa-0eb9-4f71-9fb5-18477bccf17a']/div[1]/div[1]/a[1]/img[1]")).isDisplayed()){
            System.out.println("validate pass");
        }
    }



    @Test (priority = 19)
    public void CheckDownloadpage(){
        testHome.setBestbuyApp();

    }

    @Test (priority = 20)
    public void CheckDownloadpageIOS(){
        testHome.setBestbuyApp();
        driver.findElement(By.xpath("//*[@id='site-control-content']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
        String iosurl = driver.getCurrentUrl();
        String expectedurl = "https://itunes.apple.com/us/app/best-buy/id314855255?mt=8";

        if(iosurl.equalsIgnoreCase(expectedurl)){
            System.out.println("Test passed");
        }else{
            System.out.println("Failed");
        }
    }

    @Test (priority = 21)
    public void CheckDownloadpageandroid(){
        testHome.setBestbuyApp();
        driver.findElement(By.xpath("//*[@id='site-control-content']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[2]/img[1]")).click();
        String androidurl = driver.getCurrentUrl();
        String expectedurl = "https://play.google.com/store/apps/details?id=com.bestbuy.android&hl=en";

        if(androidurl.equalsIgnoreCase(expectedurl)){
            System.out.println("Test passed");
        }else{
            System.out.println("Failed");
        }

    }

    @Test (priority = 22)
    public void clickonSavedIteams() {
        testHome.setSavedItem();

    }

    @Test(priority = 23)
    public void checkSavedIteams(){
        testHome.setSavedItem();
        String text = driver.findElement(By.xpath("//*[@id='shop-saved-items-211da1c8-de07-4018-afa6-c912886ebf9e']/div[1]/div[1]/div[4]/div[1]")).getText();
        if (driver.findElement(By.xpath("//*[@id='shop-saved-items-211da1c8-de07-4018-afa6-c912886ebf9e']/div[1]/div[1]/div[4]/div[1]")).isDisplayed()) {
            System.out.println(text);
        }else{
            System.out.println("Failed");
        }

    }

    @Test(priority = 24)
    public void checkrecommend() {
        testHome.setSavedItem();
        if (driver.findElement(By.xpath("//*[@id='shop-saved-items-6cba1d9b-aa49-4630-97b1-4d4c30420250']/div[1]/div[1]/div[4]/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//*[@id='shop-saved-items-6cba1d9b-aa49-4630-97b1-4d4c30420250']/div[1]/div[1]/div[4]/div[2]/a[1]")).click();
        }else {
            System.out.println("Failed");
        }

    }

    @Test(priority = 25)
    public void clickonTodaysDeal() {
        testHome.setTodaysDeal();
    }

    @Test(priority = 26)
    public void validatetodaysdeal(){
        testHome.setTodaysDeal();
        if (driver.findElement(By.xpath("//*[@id='widget-481509de-239a-412e-9a73-0a552423cecb']/div[1]/div[1]/div[2]/div[1]/div[1]/h1[1]")).isDisplayed()){
            System.out.println("passed");
        }else{
            System.out.println("Failed");
        }



    }


    @Test(priority = 27)
    public void clickonCareers() {
        testHome.setCareers();

    }

    @Test(priority = 28)
    public void Searchitems1()throws Exception{
        testHome.setSearch("Iphone");
    }

    @Test(priority = 29)
    public void clickonOrderStatus() {
        testHome.setOrderStatus();
    }

    @Test(priority = 30)
    public void clickonShoppingHistory() {
        testHome.setShoppingHistory();


    }

    @Test(priority = 31)
    public void clickonWeeklyad(){
        testHome.setWeeklyadd();
    }

    @Test(priority = 32)
    public void Searchitems2()throws Exception{
        testHome.setSearch("Laptop");
        String title = driver.getTitle();
        System.out.println(title);

    }

    @Test(priority = 33)
    public void Searchitems3()throws Exception{
        testHome.setSearch("Mobile phones");
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

    }

    @Test(priority = 34)
    public void Searchitems4()throws Exception{
        testHome.setSearch("Ps4");
        driver.findElement(By.xpath("//*[@id='shop-sku-list-item-8653e092-ec40-40df-8a4a-56ef21da8277']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")).click();


    }












}
