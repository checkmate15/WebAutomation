package testhompage;

import base.CommonAPI;
import hompage.Hompage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class TestHomPage extends CommonAPI {
    Hompage hpage;
    String hpgurl="https://www.cnn.com/";
    Hompage hmpage;

    @BeforeClass
    public void initialize(){
        driver.get(hpgurl);
        hmpage= PageFactory.initElements(driver, Hompage.class);

    }
    @AfterClass
    public void init(){
        driver.get(hpgurl);
    }
    @Test
    public void homebuttontest(){
        TestLogger.log(getClass().getSimpleName()+ " "+ convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName())+" "+ "Veryfy Home Button");
        hmpage.setHomebotton();
    }
    @Test
    public void menubtn() throws Exception{
        hmpage.gotoMenu();
        driver.navigate().to(hpgurl);
    }

    @Test
    public void pageTech()throws Exception{
        hmpage.getBusinessPage();
    }

    @Test
    public void glaceAtMarket() throws Exception{
        hmpage.seeMarketaGlance();
    }
    @Test
    public void imageTesting1()throws Exception{
        hmpage.image1();
    }

    @Test
    public void nikeTraging() throws Exception {
        hmpage.seeNikeTrade("Nike");
        driver.navigate().to(hpgurl);
    }

    @Test
    public void tradeScrolTest()throws Exception{
        hmpage.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        hmpage.setTopTitleImage();
    }

    @Test
    public void testCraditCard()throws Exception{
        hmpage.craditCard();
    }

   /* @Test
    public void testPaidContent()throws Exception{
        hmpage.paidContentImage();
    }
*/
   @Test
   public void testSetStorisSix(){
       hmpage.setStorisSix();
   }
    @Test
    public void testSetTopStoris(){
        hmpage.setTopStoris();
    }
    @Test
    public void testSetFirstIMG(){
        hmpage.setFirstIMG();
    }
    @Test
    public void testParenting(){
        hmpage.setTestParenting();
    }
    @Test
    public void testSetHouseStoris()throws Exception{
        hmpage.setHouseStoris("Politics");
    }
    @Test
    public void testSetPaidPartnerIMG(){
        hmpage.setPaidPartnerIMG();
    }
    @Test
    public void testSetBottomWorldAsianews(){
        hmpage.setBottomWorldAsianews();
    }
    @Test
    public void testSetbottomWorldAustralia(){
        hmpage.setbottomWorldAustralia();
    }
    @Test
    public void testSetBottomPoliticsCongress(){
        hmpage.setbottomPoliticsCongress();
    }
    @Test
    public void testSetPopulerSixthTopic(){
        hmpage.setPopulerSixthTopic();
    }
    @Test
    public void testsetImage(){
        hmpage.setTopImage();
    }
    @Test
    public void testCurrentUrl(){
        hmpage.testurl();
    }
    @Test
    public void testsetTable1stImg(){
        hmpage.setTable1stImg();
    }
    @Test
    public void testsetStoriestext(){
        hmpage.setStoriestext();
    }
    @Test
    public void testsetStoriestext1(){
        hmpage.setStoriestext1();
    }
    @Test
    public void testalltextfromUsPage(){
        hmpage.setalltextfromUsPage();
    }
    @Test
    public void testsetLastImg(){
        hmpage.setLastImg();
    }
    @Test
    public void testsetaroundtheUsText(){
        hmpage.setaroundtheUsText();
    }
    @Test
    public void testsetBottomTopics(){
        hmpage.setBottomTopics();
    }
    @Test
    public void testsetclickingonfb(){
        hmpage.setclickingonfb();
    }



}


