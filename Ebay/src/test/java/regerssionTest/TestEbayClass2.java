package regerssionTest;

import org.testng.annotations.Test;
import regression.EbayClass2;

public class TestEbayClass2 extends EbayClass2 {



    @Test
    public void TestEbayClass2()throws InterruptedException{
        TestEbayClass2();
        Thread.sleep(2000);

    }
    @Test
    public void ClickOnMotors(){
        Motors();


    }
    @Test
    public void ClickOnCarAndTrucks(){
        ClickOnCarAndTrucks();


    }

}
