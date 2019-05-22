package account;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account extends CommonAPI {
    @FindBy(xpath = "//*[@id='hf_accountMenuLink']")
    WebElement account;

    @FindBy(xpath = "//*[@id='account-menu-app']/div[1]/div[2]/div[1]/div[1]/a[1]/button[1]")
    WebElement login;

    public void setAccount(){
        account.click();
        login.click();
    }
}
