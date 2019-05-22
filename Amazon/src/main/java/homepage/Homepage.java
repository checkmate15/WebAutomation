package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonAPI {

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    WebElement search;

    @FindBy(xpath = "//*[@id='nav-hamburger-menu']")
    WebElement hamburger;
    @FindBy(xpath = "//*[@id='nav-orders']/span[2]")
    WebElement orderTab;
    @FindBy(xpath = "//*[class='nav-a']")
    WebElement sellTab;
    @FindBy(xpath = "//*[@tabindex='52']")
    WebElement registryTab;
    @FindBy(xpath = "(//a[text()='Whole foods'])")
    WebElement wholefoodsTab;
    @FindBy(xpath = "(//a[text()='Help'])")
    WebElement helpTab;
    @FindBy(xpath = "//*[@id='nav-xshop']/a[3]")
    WebElement giftcards;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    WebElement todaysdeals;
    @FindBy(xpath = "//*[class='a-size-medium a-link-normal a-text-bold']")
    WebElement yourorders;
    @FindBy(xpath = "//*[@id=\"nav-link-prime\"]/span[2]")
    WebElement tryprime;
    @FindBy(xpath = "//*[@id='nav-cart']")
    WebElement cart;
    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    WebElement account;
    @FindBy(xpath = "//*[@id='nav-your-amazon']")
    WebElement youramazon;
    @FindBy(xpath = "//*[@id=\"navSwmHoliday\"]/a/img")
    WebElement shopdeals;




    public void setSearch() {
        search.click(); }

    public void setHamburger() {

        hamburger.click(); }

    public void setOrderTab() {
        orderTab.click(); }

    public void setSellTab() {
        sellTab.click(); }

    public void setRegistryTab() {
        registryTab.click(); }

    public void setHelpTab() {
        helpTab.click(); }

    public void setGiftcards() {
        giftcards.click(); }

    public void setTodaysdeals() {
        todaysdeals.click(); }

    public void setYourorders() {
        yourorders.click(); }

    public void setTryprime(){
        tryprime.click();}

    public void setCart(){
        cart.click();}

    public void setAccount(){
        account.click();}

    public void setYouramazon(){
        youramazon.click();}

    public void setShopdeals(){
        shopdeals.click();}

}




