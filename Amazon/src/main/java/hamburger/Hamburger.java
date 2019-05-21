package hamburger;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hamburger extends CommonAPI {

    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    WebElement hamburger;

    @FindBy(xpath = "//a[@data-menu-id='13']")
    WebElement electronics;
    @FindBy(xpath = "//*[@class='hmenu-item']")
    WebElement phones;


    public void setHamburger() {
        hamburger.click();
    }
    public void setElectronics(){
        electronics.click();
    }
    public void setPhones(){
        phones.click();
    }

}
