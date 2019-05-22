package testtodaysdeal;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Todaysdeal extends CommonAPI {

    @FindBy(xpath = "//*[@tabindex='47']")
    WebElement todaysdeal;
    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[1]/div/label/span")
    WebElement amazondevice;
    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div[2]/span[1]/div/a")
    WebElement clear;

    public void setTodaysdeal(){
        todaysdeal.click();
    }
    public void setAmazondevice(){
        amazondevice.click();
    }
    public void setClear(){
        clear.click();
    }
}
