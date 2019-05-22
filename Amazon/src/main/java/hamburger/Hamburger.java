package hamburger;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hamburger extends CommonAPI {

    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    WebElement hamburger;

    @FindBy(xpath = "//a[@data-menu-id='13']")
    WebElement electronics;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[12]/li[6]/a/div")
    WebElement phones;
    @FindBy(xpath = "//a[text()='Unlocked Phones']")
    WebElement unlockedphones;
    @FindBy(xpath = "//*[@class='a-label a-checkbox-label']")
    WebElement blu;
    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
    WebElement blumega;
    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    WebElement addtocart;
    @FindBy(xpath = "//*[@id=\"attachSiNoCoverage-announce\"]")
    WebElement nothanks;
   // @FindBy(xpath = "//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")
    //WebElement cart;
    @FindBy(xpath = "//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")
    WebElement proceed;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement email;




    public void setHamburger() {
        hamburger.click();
    }
    public void setElectronics(){
        electronics.click();
    }
    public void setPhones(){
        phones.click();
    }
    public void setUnlockedphones(){
        unlockedphones.click();
    }
    public void setBlu(){
        blu.click();
    }
    public void setBlumega(){
        blumega.click();
    }
    public void setAddtocart(){
        addtocart.click();
    }
    public void setNothanks(){
        nothanks.click();
    }
   // public void setCart(){
     //   cart.click();
    //}
    public void setProceed(){
        proceed.click();
    }
    public void setEmail(){
        email.click();
    }

}
