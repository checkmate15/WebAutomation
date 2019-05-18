package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonAPI {

    @FindBy(xpath ="//*[@id='twotabsearchtextbox']" )
    WebElement search;

    @FindBy(xpath = "//*[@id='nav-hamburger-menu']")
    WebElement hamburger;
    @FindBy (xpath = "//*[@id='nav-orders']")
    WebElement orderTab;
    @FindBy(xpath = "//*[class='nav-a']")
    WebElement sellTab;
    @FindBy(xpath = "//*[@id='nav-xshop']/a[7]")
    WebElement registryTab;
    @FindBy(xpath = "//*[@id=,nav-xshop']/a[5]")
    WebElement wholefoodsTab;
    @FindBy(xpath = "//*[@id='nav-xshop']/a[4]")
    WebElement helpTab;
    @FindBy(xpath = "//*[@id='nav-xshop']/a[3]")
    WebElement giftcards;
    @FindBy(xpath = "//*[@id='nav-xshop']/a[1]")
    WebElement todaysdeals;


    public void setSearch(){
        search.click();
    }
    public void setHamburger(){
            hamburger.click();
    }
    public void setOrderTab(){
        orderTab.click();
    }
    public void setSellTab(){
        sellTab.click();
    }
    public void setRegistryTab(){
        registryTab.click();
    }
    public void setHelpTab(){
        helpTab.click();
    }
    public void setGiftcards(){
        giftcards.click();
    }
    public void setTodaysdeals(){
        todaysdeals.click();
    }







    }




