package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InventoryTests extends TestBase {

    @Test
    public void inventoryTest1(){
        super.logBrowser();
        System.out.println("Inventory Test1");

    }
    @Test
    public void inventoryTest2(){
        super.logBrowser();
        System.out.println("Inventory Test2");
    }
    @Test
    public void inventoryTest3(){
        super.logBrowser();
        System.out.println("Inventory Test3");
    }
}
