package signin;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SugnIn extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header[1]/div[2]/div[3]/div[1]/div[1]/div[3]/a[1]")
    WebElement myalibaba;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/a[1]")
    WebElement signin;




    public void setMyalibaba() {
        if (myalibaba.isDisplayed())
            myalibaba.click();
        signin.click();

    }

}


