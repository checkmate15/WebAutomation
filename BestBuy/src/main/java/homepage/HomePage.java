package homepage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


    @FindBy(xpath = "//*[@aria-controls='group0']")
    WebElement product;

    @FindBy(xpath ="//*[@id='menu1']")
    WebElement brands;

    @FindBy(xpath ="//*[@id='menu2']")
    WebElement deals;

    @FindBy(xpath = "//*[@id='menu3']")
    WebElement services;

    @FindBy(xpath = "//*[@id='hf_accountMenuLink']")
    WebElement account;

    @FindBy(xpath = "//*[@id='hf_historyMenuLink']")
    WebElement shoppingHistory;

    @FindBy(xpath = "//*[@id='hf_orderStatusMenuLink']")
    WebElement orderStatus;

    @FindBy(xpath = "//*[@id='hf_listsMenuLink']")
    WebElement savedItem;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
    WebElement todaysDeal;

    @FindBy(xpath = "//*[@data-lid='hdr_gft_crd']")
    WebElement giftCard;

    @FindBy(xpath = "//*[@id='footer']/div[2]/div[2]/div[1]/nav[1]/ul[1]/li[3]/a[1]")
    WebElement careers;

    @FindBy(xpath = "//*[@id='gh-search-input']")
    WebElement search;

    @FindBy(xpath = "//*[@id='footer']/div[1]/div[1]/a[1]")
    WebElement bestbuyApp;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")
    WebElement weeklyadd;

    public void setProduct(){
        product.click();
    }

    public void setBrands(){
        brands.click();
    }

    public void setDeals(){
        deals.click();
    }

    public void setServices(){
        services.click();
    }


    public void setAccount(){
        account.click();
    }

    public void setShoppingHistory(){
        shoppingHistory.click();
    }

    public void setOrderStatus(){
        orderStatus.click();
    }

    public void setSavedItem(){
        savedItem.click();
    }


    public void setTodaysDeal(){
        todaysDeal.click();
        if(todaysDeal.isDisplayed())
        System.out.println(driver.getCurrentUrl());
    }


    public void setGiftCard(){
        giftCard.click();
    }



    public void setCareers(){
        careers.click();
    }

    public void setSearch(String text)throws Exception{
        if (search.isEnabled())
        search.sendKeys(text, Keys.ENTER);
        Thread.sleep(5000);

    }

    public void setBestbuyApp(){

        if (bestbuyApp.isEnabled())
            bestbuyApp.click();
    }

    public void setWeeklyadd(){
        weeklyadd.click();
        if (weeklyadd.isDisplayed())
            System.out.println("passed");

    }



}
