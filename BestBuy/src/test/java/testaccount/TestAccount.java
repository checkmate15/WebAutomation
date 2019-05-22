package testaccount;

import account.Account;
import base.CommonAPI;
import brands.Brands;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAccount extends CommonAPI {
    Account testAccount;
    String url = "https://bestbuy.com";

    @BeforeClass
    public void init() throws Exception {
        testAccount = PageFactory.initElements(driver, Account.class);
        driver.get(url);
        Thread.sleep(5000);

    }

    @AfterMethod
    public void initialize() {
        driver.get(url);
    }

    @Test(priority = 44)
    public void checklogin(){
        testAccount.setAccount();
    }

    @Test(priority = 45)
    public void verifiedfield(){
        testAccount.setAccount();
        driver.findElement(By.xpath("//*[@id='fld-e']")).click();
        driver.findElement(By.xpath("//*[@id='fld-p1']")).click();
    }

    @Test(priority = 46)
    public void insertkeys(){
        testAccount.setAccount();
        driver.findElement(By.xpath("//*[@id='fld-e']")).sendKeys("testingemail@email.com");
        driver.findElement(By.xpath("//*[@id='fld-p1']")).sendKeys("testingpassword");
        driver.findElement(By.xpath("/html/body/div[1]/section/main/div[1]/div/div/div/form/button/span")).click();

    }
    @Test(priority = 47)
    public void forgetpassword(){
        testAccount.setAccount();
        driver.findElement(By.xpath("body/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/span[2]/a[1]")).click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @Test(priority = 49)
    public void wigninwithgoole(){
        testAccount.setAccount();
        driver.findElement(By.xpath("/html/body/div[1]/section/main/div[1]/div/div/div/form/div[5]/button")).click();
        navigateBack();
    }
    @Test(priority = 50)
    public void redirectTosignup(){
        testAccount.setAccount();
        driver.findElement(By.xpath("/html/body/div[1]/section/main/div[1]/div/div/div/div[2]/div/div/a")).click();
        String url = driver.getCurrentUrl();

        System.out.println(url);
    }

}
