package brands;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Brands extends CommonAPI {
    @FindBy(xpath ="//*[@id='menu1']")
    WebElement brands;

    @FindBy(xpath = "//*[@id='group1']/div[1]/ul[1]/li[2]/a[1]")
    WebElement samsung;

    @FindBy(xpath = "//*[@id='site-control-content']/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[7]/div[1]/a[1]")
    WebElement smarthome;

    public void setBrands(){
        brands.click();
    }

    public void setSamsung(){
        brands.click();
        samsung.click();

        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    public void setpageSource() {
        brands.click();
        samsung.click();

       String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);
    }

    public void setSmarthome(){
        brands.click();
        samsung.click();
        smarthome.click();
    }

    public void setsmarttitle() {
        brands.click();
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();

        System.out.println(url);
        System.out.println(title);
    }

}
