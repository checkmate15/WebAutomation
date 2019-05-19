package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


    @FindBy(xpath = "//*[@aria-controls='group0']")
    WebElement product;

    public void setProduct(){
        product.click();
    }

    @FindBy(xpath ="//*[@id='menu1']")
    WebElement brands;

    public void setBrands(){
        brands.click();
    }

    @FindBy(xpath ="//*[@id='menu2']")
    WebElement deals;

    public void setDeals(){
        deals.click();
    }


    @FindBy(xpath = "//*[@id='menu3']")
    WebElement services;

    public void setServices(){
        services.click();
    }

    @FindBy(xpath = "//*[@id='hf_accountMenuLink']")
    WebElement account;

    public void setAccount(){
        account.click();
    }
    @FindBy(xpath = "//*[@id='hf_historyMenuLink']")
    WebElement shoppingHistory;

    public void setShoppingHistory(){
        shoppingHistory.click();
    }
    @FindBy(xpath = "//*[@id='hf_orderStatusMenuLink']")
    WebElement orderStatus;

    public void setOrderStatus(){
        orderStatus.click();
    }
    @FindBy(xpath = "//*[@id='hf_listsMenuLink']")
    WebElement savedItem;

    public void setSavedItem(){
        savedItem.click();
    }
    @FindBy(xpath = "//*[@data-lid='Deal of the Day']")
    WebElement todaysDeal;

    public void setTodaysDeal(){
        todaysDeal.click();
    }

    @FindBy(xpath = "//*[@data-lid='hdr_gft_crd']")
    WebElement giftCard;

    public void setGiftCard(){
        giftCard.click();
    }


    @FindBy(xpath = "//*[@data-lid='ft_car']")
    WebElement careers;

    public void setCareers(){
        careers.click();
    }



}
