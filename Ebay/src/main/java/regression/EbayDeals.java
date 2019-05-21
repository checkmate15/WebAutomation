package regression;

import base.CommonAPI;
import org.openqa.selenium.By;

public class EbayDeals extends CommonAPI {

    public void setDeals() {
        driver.findElement(By.xpath("//*[@id=\"refit-spf-container\"]/div[1]/h1/a"));
    }

    public void setGiftCard() {
        driver.findElement(By.xpath("//*[@id=\"gh-p-4\"]/a")).click();
    }

    public void setHelpAndContact() {
        driver.findElement(By.xpath("//*[@id=\"gh-p-3\"]/a")).click();
    }
}
