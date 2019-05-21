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
    @FindBy(xpath ="//*[@id=\"scc-category-unit-index\"]/div[1]/ul[1]/li[4]/a[1]")
    WebElement machinary;
    @FindBy(xpath = "//*[@id=\"scc-category-unit-index\"]/div[1]/ul[1]/li[1]/a[1]")
    WebElement consumer;

    @FindBy(xpath = "//*[@id=\"recommendation-for-you\"]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement blackview;
    @FindBy(xpath = "//*[@id=\"recommendation-for-you\"]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement oukitel;
    @FindBy(xpath = "//*[@id=\"recommendation-for-you\"]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement foldphone;
    @FindBy(xpath ="//*[@id=\"scc-category-unit-index\"]/div[1]/ul[1]/li[7]/a[1]" )
    WebElement furniture;
    @FindBy(xpath = "//*[@id=\"scc-category-unit-index\"]/div[1]/ul[1]/li[7]/a[1]")
    WebElement vehicles;
    @FindBy(xpath = "//*[@id='J_SC_header']")
    WebElement singIn;
    @FindBy(xpath = "//*[@id=\"recommendation-for-you\"]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement androidphone;
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
    @FindBy(xpath = "//*[@id=\"scc-category-unit-index\"]/div[1]/ul[1]/li[8]/a[1]")
    WebElement sports;
    @FindBy(xpath = "//*[@id=\"scc-category-unit-index\"]/div[1]/ul[1]/li[6]/a[1]")
    WebElement homekicthen;
    @FindBy(xpath = "//*[@id=\"scc-category-unit-index\"]/div[1]/ul[1]/li[8]/a[1]")
    WebElement shoes;
    @FindBy(xpath = "//*[@class='item-image zoom-wrap']")
    WebElement jacket;
    @FindBy(xpath ="//*[@id=\"recommendation-for-you\"]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/h2[1]/a[1]" )
    WebElement huwaeimobile;
    @FindBy(xpath ="//*[@id=\"recommendation-for-you\"]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement Sphone;
    @FindBy(xpath = "//*[@id=\"recommendation-for-you\"]/div[2]/div[1]/div[1]/div[9]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement iphonexr;
    @FindBy(xpath = "//*[@id=\"home2017_services\"]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    WebElement indea;

    @FindBy(xpath = "//*[@id=\"home2017_services\"]/div[1]/div[2]/ul[1]/li[6]/a[1]")
    WebElement vietnum;
    @FindBy(xpath = "//*[@id=\"home2017_services\"]/div[1]/div[2]/ul[1]/li[2]/a[1]")
    WebElement USA;
    @FindBy(xpath = "//*[@id=\"ui-footer\"]/div[1]/div[2]/dl[1]/dd[1]/a[1]")
    WebElement aboutalibaba;
    @FindBy(xpath = "//*[@id=\"home2017_services\"]/div[1]/div[2]/ul[1]/li[3]/a[1]")
    WebElement turkey;

    public void setTurkey(){
        if(turkey.isDisplayed()){
            System.out.println(("passed"));
        }else
            System.out.println("failed");

    }

    public void setAboutalibaba(){
        if(aboutalibaba.isDisplayed()) {
            System.out.println("Passed");
        }else
            System.out.println("Failed");
    }


    public void setUSA(){
        if(USA.isDisplayed())
            Assert.assertTrue(true );


    }

    public void setVietnum(){
        if(vietnum.isDisplayed())
            Assert.assertTrue(true);
        vietnum.click();

    }


    public void setIndea(){
        indea.click();    }

    public void setIphonexr(){
        iphonexr.click();

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
    public void setSingIn(){
        singIn.click();
    }
    public void setVehicles(){
        vehicles.click();
    }
    public void setMachinary(){
        machinary.click();
    }
    public void setConsumer(){
        consumer.click();
    }
    public void setAndroidphone() {
        if (androidphone.isEnabled())
            androidphone.click();
    }
    public void setBlackview(){
        blackview.click();
        String title = driver.getTitle();
        System.out.println(title);
    }
    public void setfoldphone(){
        if(foldphone.isDisplayed())
            Assert.assertTrue(true);
        foldphone.click();

    }
    public void setoukitel(){
        oukitel.click();
    }
    



}
