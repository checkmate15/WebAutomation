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
    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[10]/div/label/span")
    WebElement camera;
    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div[5]/span[3]/div/a")
    WebElement discount;
    @FindBy(xpath = "//*[@id=\"dealImage\"]/div/div/div[2]")
    WebElement discountitem;
    @FindBy(xpath = "//*[@title='Add to List']")
    WebElement addtolist;
    @FindBy(xpath = "//*[@id=\"auth-fpp-link-bottom\"]")
    WebElement forgetpass;
    @FindBy(xpath = "//*[@tabindex='1']")
    WebElement enterphone;
    @FindBy(xpath = "")
    WebElement enter;





    public void setTodaysdeal(){
        todaysdeal.click();
    }
    public void setAmazondevice(){
        amazondevice.click();
    }
    public void setClear(){
        clear.click();
    }
    public void setCamera(){
        camera.click();
    }
    public void setDiscount(){
        discount.click();
    }
    public void setDiscountitem(){
        discountitem.click();
    }
    public void setAddtolist(){
        addtolist.click();
    }
    public void setForgetpass(){
       forgetpass.click();
    }
    public void setEnterphone(){
        enterphone.click();
    }
    public void setEnter(){
        enterphone.click();
    }


}
