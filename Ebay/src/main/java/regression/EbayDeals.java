package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayDeals extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[12]/a")
    WebElement Deals;


public void setDeals() {
    Deals.click();
}

}
