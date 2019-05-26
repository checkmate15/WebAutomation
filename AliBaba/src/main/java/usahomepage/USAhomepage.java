package usahomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class USAhomepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[1]/div[3]/div/div/div[1]/div/div[1]/div/div[1]/a")
    WebElement agriculture;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[1]/div[3]/div/div/div[1]/div/div[2]/div/div[1]/a")
    WebElement apperial;

    public void setApperial(){
        if(apperial.isDisplayed())
            apperial.click();
    }




    public void setAgriculture(){
        agriculture.click();

    }
}
