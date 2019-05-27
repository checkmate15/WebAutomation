package signin;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SignIn extends CommonAPI {


    public void setaccount(){
        clickByXpath("//*[@id=\"nav-link-accountList\"]/span[2]");
    }
    public void settype() {
        clickByXpath("//*[@id='ap_email']");
        typeByXpath("//*[@id='ap_email']","Aminrahman123@gmail.com");
        clickByXpath("//*[@id='ap_password']");
        typeByXpath("//*[@id='ap_password']","1234567");
        clickByXpath("//*[@id='signInSubmit']");












    }
}
