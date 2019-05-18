package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id='menu0']")
    WebElement product;

    public void setProduct(){
        product.click();
    }

    @FindBy(xpath ="//*[@id='menu1']")
    WebElement brands;

    public void setBrands(){
        brands.click();
    }
}
