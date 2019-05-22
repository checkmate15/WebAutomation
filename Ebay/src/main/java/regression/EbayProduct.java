package regression;

import base.CommonAPI;
import javafx.application.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import javax.print.DocFlavor;
import java.util.logging.XMLFormatter;

public class EbayProduct extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    WebElement Fashion;

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

    @FindBy(xpath = "//*[@id=\"gh-p-4\"]/a")
    WebElement GiftCards;

    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[1]/a")
    WebElement Coupons;




    public void setFashion() {
        Fashion.click();

    }

    public void setWomnsCloth() {
        WomnsCloth.click();

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

    public void setWatches() {
        Watches.click();

    }

    public void setGiftCards() {
        GiftCards.click();

    }

    public void setCoupons() {
        Coupons.click();
        navigateBack();


    }
}

