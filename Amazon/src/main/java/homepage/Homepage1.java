package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Homepage1 extends CommonAPI {

    @FindBy(xpath = "//*[@id='nav-hamburger-menu']")
    WebElement hamburger;

    @FindBy(xpath = "//*[@id='hmenu-content']")
    WebElement electronics;


    public void setHamburger() {
        hamburger.click();
    }
    public void setElectronics(){
        electronics.click();
    }
}
