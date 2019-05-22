package usahomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class USAhomepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"home2017_services\"]/div[1]/div[2]/ul[1]/li[2]/a[1]")
    WebElement USA;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[1]/div[3]/div/div/div[1]/div/div[1]/div/div[1]/a")
    WebElement agriculture;

    public void setUSA(){
        USA.click();
    }
    public void setAgriculture(){
        USA.click();
        agriculture.click();
    }
}
