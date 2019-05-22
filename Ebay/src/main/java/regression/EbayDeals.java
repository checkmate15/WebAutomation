package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayDeals extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"gh-p-1\"]/a")
    WebElement Deals;

    @FindBy(xpath ="//*[@id=\"nav_7411926\"]/span" )
    WebElement Featured;

    @FindBy(xpath = "//*[@id=\"nav_7411927\"]")
    WebElement Tech;

    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[2]/div/div[1]/a[1]")
    WebElement CellPhones;

    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[2]/div/div[1]/a[2]")
    WebElement LaptopsAndNetbooks;

    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[2]/div/div[1]/a[4]")
    WebElement CamerasAndPhoto;

    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[2]/div/div[1]/a[5]")
    WebElement VideoGamesAndConsoles;

    @FindBy(xpath = "//*[@id=\"nav_7872149\"]/span")
    WebElement Fashion;

    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[3]/div/div[1]/a[1]")
    WebElement MensShoes;


    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[3]/div/div[1]/a[2]")
    WebElement WomensShoes;


    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[3]/div/div[1]/a[3]")
    WebElement Watches;


    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[3]/div/div[1]/a[4]")
    WebElement MensClothing;


    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[3]/div/div[1]/a[5]")
    WebElement WomensClothing;


    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[3]/div/div[2]/a[3]")
    WebElement FineJewelry;


    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[3]/div/div[2]/a[4]")
    WebElement Beauty;


    @FindBy(xpath = "//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[3]/div/div[2]/a[5]")
    WebElement Health;


    @FindBy(xpath = "//*[@id=\"nav_8555494\"]/span")
    WebElement HomeAndGarden;


    @FindBy(xpath = "//*[@id=\"nav_6066874\"]/span")
    WebElement SportingGoods;

    @FindBy(xpath = "//*[@id=\"nav_1014733\"]/span")
    WebElement Automotive;

    @FindBy(xpath = "//*[@id=\"nav_5815941\"]/span")
    WebElement OtherDeals;




    public void setDeals() {
    Deals.click();
}
    public void setFeatured(){
        Deals.click();
        Featured.click();
    }

    public void setTech() {
        Deals.click();
        Tech.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);
    }

    public void setCellPhones(){
        Deals.click();
        Tech.click();
        CellPhones.click();

        String url = driver.getCurrentUrl();
        System.out.println(url);

    }
    public void setLaptopsAndNetbooks(){
        Deals.click();
        Tech.click();
        LaptopsAndNetbooks.click();

        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    public void setCamerasAndPhoto() {
        Deals.click();
        Tech.click();
        CamerasAndPhoto.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);
    }

    public void setVideoGamesAndConsoles(){
        Deals.click();
        Tech.click();
        VideoGamesAndConsoles.click();
    }
    public void setFashion(){
        Deals.click();
        Fashion.click();

    }

    public void setMensShoes() {
        Deals.click();
        Fashion.click();
        MensShoes.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);
    }

    public void setWomensShoes(){
        Deals.click();
        Fashion.click();
        WomensShoes.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);
    }
    public void setWatches(){
        Deals.click();
        Fashion.click();
        Watches.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);
    }

    public void setMensClothing(){
        Deals.click();
        Fashion.click();
        MensClothing.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);
    }

    public void setWomensClothing() {
        Deals.click();
        Fashion.click();
        WomensClothing.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);
    }
    public void setFineJewelry(){
        Deals.click();
        Fashion.click();
        FineJewelry.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);
    }

    public void setBeauty(){
        Deals.click();
        Fashion.click();
        Beauty.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);
    }

    public void setHealth(){
        Deals.click();
        Fashion.click();
        Health.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);

}
    public void setHomeAndGarden(){
        Deals.click();
        Fashion.click();
        HomeAndGarden.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);

    }
    public void setSportingGoods(){
        Deals.click();
        SportingGoods.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);

    }
    public void setAutomotive(){
        Deals.click();
        Automotive.click();


        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);

    }
    public void setOtherDeals(){
        Deals.click();
        OtherDeals.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);

    }
}

