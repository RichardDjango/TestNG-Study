package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.*;

public class PurchaseTests extends TestBase {

    @Test
    protected void purchaseTest1(){
        super.logBrowser();
        super.log(Status.INFO, "Verification Done");
        String actVale = "hello";
        String exptValue = "hello";
//        Assert.assertEquals(actVale,exptValue, "Values do not match");  //checks actual and expected value is true or not.If false it fails the test.
//        Assert.assertNotEquals(actVale,exptValue,"The values match!!");
        System.out.println("Purchase test 1 success");
    }
    @Test
    protected void purchaseTest2(){
        super.logBrowser();
//        Assert.fail("Some verification failed");
        System.out.println("Test complete");
        System.out.println("Purchase Test2");
    }
    @Test
    protected void purchaseTest3(){
        super.logBrowser();
        System.out.println("Purchase Test3");

    }

    @Test
    protected void purchaseTest4(){
        super.logBrowser();
        Boolean b = true;
//        Assert.assertTrue(b,"It is not true"); //checks if b is true or else it exits the test
//        Assert.assertFalse(b,"The value is true");
        System.out.println("Purchase Test 4");
    }

    @Test
    protected void purchaseTest5(){
        super.logBrowser();
        String s = "";
//        Assert.assertNull(s,"The value is not null"); //checks whether the object is null.
        Assert.assertNotNull(s,"The vale is null");
        System.out.println("Purchase Test 5");

    }
}
