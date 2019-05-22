package furniturepage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FurniturePage extends CommonAPI {
   @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[1]/div/ul/li[2]/a/div[2]")
    WebElement bedroom;
   @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div/div/div/div[1]/div[2]/div[1]/a/div[1]")
   WebElement antiquefurniture;
   @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div/div/div/div[1]/div[2]/div[3]/a/div[1]")
   WebElement commercialfurniture;
   @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div/div/div/div[1]/div[2]/div[2]/a/div[1]")
   WebElement childrenfurniture;
   @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[2]/div/div/form/div[2]/input")
   WebElement search;
   @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div/div[2]/a")
   WebElement sofa;


   public void setSearch(String name){
       if(search.isEnabled())
           Assert.assertTrue(true);
       search.sendKeys(name, Keys.ENTER);
   }

   public void setChildrenfurniture(){
       if(childrenfurniture.isDisplayed())
           childrenfurniture.click();
   }

   public void setCommercialfurniture(){
       if(commercialfurniture.isDisplayed())
       commercialfurniture.click();
   }


   public void setAntiquefurniture(){
       if(antiquefurniture.isDisplayed())
           antiquefurniture.click();
   }






}
