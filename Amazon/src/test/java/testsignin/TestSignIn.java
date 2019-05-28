package testsignin;

import amazonsearch.AmazonSearch;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import signin.SignIn;

public class TestSignIn extends CommonAPI {
    String url ="https://www.amazon.com/";
    SignIn testaccount;

    @BeforeClass
    public void initialize() throws Exception {
        testaccount = PageFactory.initElements(driver, SignIn.class);
        driver.get(url);

    }

    @AfterClass
    public void init(){
        driver.get(url);
    }
    @Test(priority = 46)
    public void clickonaccount(){
        testaccount.setaccount();
    }
    @Test(priority = 46)
    public void clickontype() {
        testaccount.settype();

    }
}
