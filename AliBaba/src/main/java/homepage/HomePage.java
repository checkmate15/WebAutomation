package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath ="//*[@title='Home & Garden']")
    WebElement homegurden;
    @FindBy(xpath = "//*[@title='Gifts & Crafts']")
    WebElement giftcarfts;

    @FindBy(xpath = "//*[@title='Textiles & Leather Products']")
    WebElement textiles;
    @FindBy(xpath = "//*[@title='Construction & Real Estate']")
    WebElement construction;
    @FindBy(xpath = "//*[@title='Lights & Lighting']")
    WebElement lights;
    @FindBy(xpath = "//*[@title='Furniture']")
    WebElement furniture;
    @FindBy(xpath = "//*[@title='Vehicles & Accessories']")
    WebElement vehicles;
    @FindBy(xpath = "//*[@id='J_SC_header']")
    WebElement singIn;
    @FindBy(xpath = "//*[@title='Industrial Machinery']")
    WebElement industrialmachinery;



    public void setHomegurden(){homegurden.click();}
    public void setGiftcarfts(){
        giftcarfts.click();
    }

    public void setTextiles(){
        textiles.click();
    }
    public void setConstruction(){ construction.click(); }
    public void setLights(){
        lights.click();
    }
    public void  setFurniture(){
        furniture.click();
    }
    public void setVehicles(){
        vehicles.click();
    }
    public void setSingIn(){
        singIn.click();
    }
    public void setIndustrialmachinery(){
        industrialmachinery.click();
    }


}
