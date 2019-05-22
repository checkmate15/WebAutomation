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


    @FindBy(xpath = "//*[@id=\"gh-p-4\"]/a")
    WebElement GiftCards;

    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[1]/a")
    WebElement Coupons;

    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[4]/a")
    WebElement eBayGiftCards;

    @FindBy(xpath = "//*[@id=\"w1-w0-w0-toggle-button\"]")
    WebElement WomnsCloth;

    @FindBy(xpath = "//*[@id=\"w1-w0-w0\"]/ul/li[2]/a")
    WebElement Dresses;

    @FindBy(xpath = "//*[@id=\"w1-w0-w2-toggle-button\"]/span")
    WebElement Shoes;

    @FindBy(xpath = "//*[@id=\"w1-w0-w3-toggle-button\"]/span")
    WebElement Jewelry;

    @FindBy(xpath = "//*[@id=\"w1-w0-w4-toggle-button\"]/span")
    WebElement Watches;




    public void setGiftCards() {
        GiftCards.click();

    }

    public void setCoupons() {
            Coupons.click();


    }
    public void seteBayGiftCards(){
        eBayGiftCards.click();
    }
    public void setWomnsCloth(String text) throws Exception {
        if (WomnsCloth.isEnabled())
           .sendKeys(text, Keys.ENTER);
        Thread.sleep(5000);


    }
    public void setDresses() {
        Dresses.click();

    }
    public void setShoes() {
        Shoes.click();

    }
    public void setJewelry() {
        Jewelry.click();


    }



}

