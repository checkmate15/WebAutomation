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
    @FindBy(xpath = "//*[@aria-lebellby='a-autoid-14-announce']")
    WebElement display1;



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
    public void setDisplay1(){
        display1.click();
    }

}
