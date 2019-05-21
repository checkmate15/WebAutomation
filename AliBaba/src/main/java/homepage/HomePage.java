package homepage;

import base.CommonAPI;
import com.sun.org.apache.xpath.internal.operations.Div;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.security.Key;

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
    @FindBy(xpath ="//*[@title='Furniture']" )
    WebElement furniture;
    @FindBy(xpath = "//*[@title='Vehicles & Accessories']")
    WebElement vehicles;
    @FindBy(xpath = "//*[@id='J_SC_header']")
    WebElement singIn;
    @FindBy(xpath = "//*[@title='Industrial Machinery']")
    WebElement industrialmachinery;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header[1]/div[2]/div[1]/div[1]/div[1]/h3[1]")
    WebElement categoris;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header[1]/div[1]/div[5]/ul[1]/li[3]/a[1]")
    WebElement tradeshows;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header[1]/div[1]/div[5]/ul[1]/li[5]/a[1]")
    WebElement getapp;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]")
    WebElement language;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header[1]/div[1]/div[3]/ul[1]/li[1]/span[1]")
    WebElement SourcingSolution;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header[1]/div[1]/div[3]/ul[1]/li[2]/span[1]")
    WebElement serviceandmembership;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header[1]/div[1]/div[3]/ul[1]/li[3]/span[1]")
    WebElement helpcommuinity;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]")
    WebElement products;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"scc-category-unit-index\"]/div[1]/ul[1]/li[2]/a[1]")
    WebElement Apparel;
    @FindBy(xpath = "//*[@title='Sports & Entertainment']")
    WebElement sports;
    @FindBy(xpath = "//*[@title='Home & Kitchen']")
    WebElement homekicthen;
    @FindBy(xpath = "//*[@title='Shoes & Accessories']")
    WebElement shoes;
    @FindBy(xpath = "//*[@class='item-image zoom-wrap']")
    WebElement jacket;
    @FindBy(xpath ="//*[@title='New huawei mobile phones prices in china  Arrival Huawei Mate 20 Pro, 6GB+128GB, Triple Back Cameras']" )
    WebElement huwaeimobile;
    @FindBy(xpath ="//*[@title='5.7 inch 6G+128G 9000mah Android 8.1 Rugged Phone,Rugged Smartphone , Android8.1 rugged mobile phone with walkie-talkie PTt']")
    WebElement Sphone;
    @FindBy(xpath = "//*[@title='Trulyplus Newest Technology i9s Earphone BT 5.0  Mini TWS Stereo Wireless Earbuds']")
    WebElement earpod;
    @FindBy(xpath = "//*[@id=\"home2017_services\"]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    WebElement indea;

    @FindBy(xpath = "//*[@id=\"home2017_services\"]/div[1]/div[2]/ul[1]/li[6]/a[1]")
    WebElement vietnum;

    public void setVietnum(){
        if(vietnum.isDisplayed())
            Assert.assertTrue(true);
        vietnum.click();

    }


    public void setIndea(){
        indea.click();    }

    public void setEarpod(){
        earpod.click();

    }
    public void setSearchh(String name){
        if(search.isEnabled())
            search.sendKeys(name, Keys.ENTER);

    }

    public void setSphone(){
        if(Sphone.isDisplayed()){
            System.out.println("passed");
        }else
            System.out.println("Failed");
    }


    public void setHuwaeimobile(){
        huwaeimobile.click();
    }

    public void setJacket(){
        jacket.click();
        if(jacket.isDisplayed()) {
            System.out.println("passed");
        }else
            System.out.println("failed");

    }




    public void setShoes(){
         if(shoes.isDisplayed())
             shoes.click();
         String title =driver.getTitle();
        System.out.println(title );
    }


    public void setHomekicthen(){
        if(homekicthen.isEnabled())
            homekicthen.click();
        String url =driver.getCurrentUrl();
        System.out.println(url);
    }
    public void setSports(){
        sports.click();
    }



    public void setApparel(){
        Apparel.click();
    }

    public void setSearch(String name) throws Exception {
        if (search.isEnabled())
            search.sendKeys(name, Keys.ENTER);
        Thread.sleep(2000);
    }

    public void setProducts(){
        if(products.isDisplayed())
            System.out.println("Paased");
    }

    public void setHelpcommuinity(){
        if(helpcommuinity.isEnabled())
            helpcommuinity.click();
    }

    public void setServiceandmembership(){
        serviceandmembership.click();

    }
    public void setSourcingSolution(){
        if(SourcingSolution.isDisplayed())
            System.out.println("passed");
    }

    public void setLanguage(){
        if(language.isDisplayed())
            Assert.assertTrue(true);

    }

    public void setGetapp(){
        getapp.click();
        String title = driver.getTitle();
        System.out.println(title);

    }

    public void setTradeshows(){
        tradeshows.click();
        Assert.assertTrue(true);
    }


    public void setCategoris(){
    if(categoris.isEnabled())
        categoris.click();



    }
    



   /* public void setHomegurden(){homegurden.click();}
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
    }*/


}
