package testhomepage;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage testHome;
    String url = "https://bestbuy.com";

    @BeforeClass
    public void init() throws Exception{
        testHome = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
        Thread.sleep(5000);

    }


    @Test
    public void gettitleandurl(){
        driver.navigate().to(url);
        String MainTitle = driver.getTitle();
        System.out.println(MainTitle);

        String MainUrl = driver.getCurrentUrl();
        System.out.println(MainUrl);
    }

    @Test
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

    @Test
    public void clickOnproduct() {
        testHome.setProduct();
    }

    @Test
    public void inproduct() {
        testHome.setProduct();
        driver.findElement(By.xpath("//*[@id=\"level2Menu0\"]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"level2Group0\"]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();

        driver.navigate().to(url);
    }

    @Test
    public void checkproduct() {
        testHome.setProduct();
        String checktext = driver.findElement(By.xpath("//*[@id=\"group0\"]/div[4]/div[1]/ul[1]/li[1]/a[1]/span[2]")).getText();
        System.out.println(checktext);
        driver.navigate().to(url);
    }





    @Test
    public void clickonBrands() {
        testHome.setBrands();
    }

    @Test
    public void checkBrands() {
        testHome.setBrands();
        driver.findElement(By.xpath("//*[@id='group1']/div[1]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id='site-control-content']/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]/h2[1]")).click();
        driver.findElement(By.xpath("//*[@class='btn btn-primary btn-sm btn-block btn-leading-ficon add-to-cart-button']")).click();
        driver.findElement(By.xpath("//*[@id='header']/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();

        if (driver.findElement(By.xpath("//*[@id='cartApp']/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).isDisplayed()){
            System.out.println("cart checking Passed");
        }

        driver.navigate().to(url);


    }

    @Test
    public void clickonDeals() {
        testHome.setDeals();
    }

    @Test
    public void clickonServices() {
        testHome.setServices();
        driver.navigate().to(url);
    }

    @Test
    public void clickonAccount() {
        testHome.setAccount();
        driver.navigate().to(url);

    }
    @Test
    public void clickonButton() {
        testHome.setAccount();
        driver.findElement(By.xpath("//*[@id=\"account-menu-app\"]/div[1]/div[2]/div[1]/div[1]/a[1]/button[1]")).click();
        String newurl = driver.getCurrentUrl();
        String expectedurl = "https://www.bestbuy.com/identity/signin?token=tid%3Afaa8cc3e-7ba4-11e9-baaf-005056ae5cbe";

        if(newurl.equalsIgnoreCase(expectedurl)) {
            System.out.println("Sign in page Passed");
        }
        driver.navigate().to(url);


    }

    @Test
    public void clickonGiftCard() {
        testHome.setGiftCard();
        navigateBack();
    }


    @Test
    public void CheckDownloadpage(){
        testHome.setBestbuyApp();
        navigateBack();
    }

    @Test
    public void clickonSavedIteams() {
        testHome.setSavedItem();
        navigateBack();

    }

    @Test
    public void clickonTodaysDeal() {
        testHome.setTodaysDeal();
        navigateBack();
    }


    @Test
    public void clickonCareers() {
        testHome.setCareers();
        driver.navigate().to(url);
    }

    @Test
    public void Searchitems1()throws Exception{
        testHome.setSearch("Iphone");
        navigateBack();
    }

    @Test
    public void clickonOrderStatus() {
        testHome.setOrderStatus();
    }

    @Test
    public void clickonShoppingHistory() {
        testHome.setShoppingHistory();
        driver.navigate().to(url);

    }

    @Test
    public void clickonWeeklyad(){
        testHome.setWeeklyadd();
        navigateBack();
    }

    @Test
    public void Searchitems2()throws Exception{
        testHome.setSearch("Laptop");
        String title = driver.getTitle();
        System.out.println(title);
        navigateBack();
    }

    @Test
    public void Searchitems3()throws Exception{
        testHome.setSearch("Mobile phones");
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        navigateBack();
    }

    @Test
    public void Searchitems4()throws Exception{
        testHome.setSearch("Ps4");
        driver.findElement(By.xpath("//*[@id='shop-sku-list-item-8653e092-ec40-40df-8a4a-56ef21da8277']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")).click();

        driver.navigate().to(url);
    }










}
