package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InventoryTests extends TestBase {

    @Test
    public void inventoryTest1(){
        super.logBrowser();
        System.out.println("Inventory Test1");

    }
    @Test
    public void inventoryTest2(){
        super.logBrowser();
        SoftAssert soft = new SoftAssert(); //soft assertion is not static, thus we need to create a object reference variable.

        String actual = "Ricard";
        String expected = "Richard";
        soft.assertEquals(actual,expected,"Not equal!!");
        soft.assertTrue(false,"The value is not true");
//        soft.assertNull(); etc etc(same methods as hard assertions)

//        soft.assertAll();
        System.out.println("Test successfull");
        System.out.println("Inventory Test2");
    }
    @Test
    public void inventoryTest3(){
        super.logBrowser();
        System.out.println("Inventory Test3");
    }

    //    if dataprovider is in a different class, then we need to be using DataProviderClass

    @Test(dataProvider = "dpLogin", dataProviderClass = InventoryTests.class)
    public void loginTest(String username, String password){
        System.out.println("Username: " + username + ", Password: " + password);
    }

    @DataProvider(name = "dpLogin")
    public Object[][] logindata(){

        Object[][] nameAndPass = {
                {"John","alpha"},
                {"David," , "beta"},
                {"Sara", "Gamma"}
        };
        return nameAndPass;
    }
}
