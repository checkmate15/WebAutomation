package product;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends CommonAPI {
    @FindBy(xpath = "//*[@aria-controls='group0']")
    WebElement product;

    @FindBy(xpath = "//*[@id='level2Menu0']/a[1]")
    WebElement appliances;

    @FindBy(xpath = "//*[@id='level2Menu6']/a[1]")
    WebElement Videogames;

    @FindBy(xpath = "//*[@id='level2Group6']/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]")
    WebElement Allplaystation;

    public void setProduct(){
        product.click();
    }

    public void setAppliances(){
        product.click();
        appliances.click();
    }

    public void setVideogames(){
        product.click();
        Videogames.click();
    }

    public void setAllplaystation(){
        product.click();
        Videogames.click();
        Allplaystation.click();
    }




}
