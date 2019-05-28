package amazonsearch;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class AmazonSearch extends CommonAPI {

    @FindBy( xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement SearchButton;
    @FindBy(xpath = "//*[@tabindex='20']")
    WebElement go;


//    public void setSearchButton(String name) {
//        SearchButton.sendKeys(name, Keys.ENTER);

//    }

//    public void setSearchItem(String text) throws Exception {
//        if (SearchButton.isEnabled())
//            SearchButton.sendKeys(text, Keys.ENTER);
//        Thread.sleep(5000);

//    }
//    public void setGo(){
//        go.click();
//    }
//    public void setSearch (){
//       clickByXpath("//*[@id=\"twotabsearchtextbox\"]");

//    }
    public void settype(String name) {
        clickByXpath("//*[@id=\"twotabsearchtextbox\"]");
        if (SearchButton.isEnabled())
            SearchButton.sendKeys(name, Keys.ENTER);
        clickByXpath("//*[@tabindex='20']");
//       Thread.sleep(5000);
    }
//    public void setRun(){
//        clickByXpath("//*[@tabindex='20']");
//    }




    }
