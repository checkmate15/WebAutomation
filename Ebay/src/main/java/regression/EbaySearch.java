package regression;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySearch extends CommonAPI {

    @FindBy(id = "gh-shop-a")
    WebElement ShopByCategory;

    @FindBy(id = "gh-ac")
    WebElement SearchButton;

    @FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
    WebElement SignIn;

    @FindBy(xpath = "//*[@id=\"sgnBt\"]")
    WebElement SignInButton;

    @FindBy(xpath = "//*[@id=\"userid\"]")
    WebElement UserName;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement PassWord;

    @FindBy(xpath = "//*[@id=\"InLineCreateAnAccount\"]")
    WebElement createAnAccount;

    @FindBy(xpath = "//*[@id=\"firstname_r\"]")
    WebElement FirstName;

    @FindBy(xpath = "//*[@id=\"lastname_r\"]")
    WebElement LastName;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement Email;

    @FindBy(xpath = "//*[@id=\"PASSWORD\"]")
    WebElement Password;

    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    WebElement Search;

    @FindBy(xpath = "//*[@id=\"gh-cat\"]")
    WebElement AllCategories;

    @FindBy(xpath = "//*[@id=\"nav-1\"]/div[1]/a/h2")
    WebElement Motors;

    @FindBy(xpath = "//*[@id=\"nav-2\"]/div[1]/a/h2")
    WebElement Fashion;

    @FindBy(xpath = "//*[@id=\"nav-3\"]/div[1]/a/h2")
    WebElement Electronics;

    @FindBy(xpath = "//*[@id=\"nav-4\"]/div[1]/a/h2")
    WebElement CollectiblesAndArt;

    @FindBy(xpath = "//*[@id=\"nav-5\"]/div[1]/a/h2")
    WebElement HomeAndGarden;

    @FindBy(xpath = "//*[@id=\"nav-6\"]/div[1]/a/h2")
    WebElement SportingGoods;

    @FindBy(xpath = "//*[@id=\"nav-7\"]/div[1]/a/h2")
    WebElement ToysAndHobbies;

    @FindBy(xpath = "//*[@id=\"nav-8\"]/div[1]/a/h2")
    WebElement BusinessAndIndustrial;

    @FindBy(xpath = "//*[@id=\"nav-9\"]/div[1]/a/h2")
    WebElement Music;

    public void setShopByCategory() {
        ShopByCategory.click();

    }
    public void setSignIn() {
        SignIn.click();
    }

    public void setSignInButton() {
        SignInButton.click();
    }

    public void setUserName() {
        UserName.click();
    }

    public void setPassWord() {
        PassWord.click();
    }

    public void setcreateAnAccount() {
        createAnAccount.click();
    }

    public void setFirstName() {
        FirstName.click();
    }

    public void setLastName() {
        LastName.click();
    }

    public void setEmail() {
        Email.click();
    }

    public void setPassword() {
        Password.click();


    }
    public void setSearchButton(String name) {
        SearchButton.sendKeys(name,Keys.ENTER);
    }

    public void setSearchItem(String text) throws Exception {
        if (Search.isEnabled())
            Search.sendKeys(text, Keys.ENTER);
        Thread.sleep(5000);

    }

    public void setAllCategories() {
        AllCategories.click();
        if (AllCategories.isDisplayed())
            System.out.println(driver.getCurrentUrl());
    }

    public void setMotors() {
            Motors.click();
    }

    public void setFashion() {
            Fashion.click();
    }

    public void setElectronics() {
            Electronics.click();
    }

    public void setCollectiblesAndArt() {
            CollectiblesAndArt.click();
    }

    public void setHomeAndGarden() {
            HomeAndGarden.click();
    }

    public void setSportingGoods() {
            SportingGoods.click();
    }

    public void setToysAndHobbies() {
            ToysAndHobbies.click();

    }

    public void setBusinessAndIndustrial() {
        BusinessAndIndustrial.click();
    }

    public void setMusic() {
            Music.click();


    }
}