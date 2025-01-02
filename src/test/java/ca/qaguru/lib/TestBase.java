package ca.qaguru.lib;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import com.beust.jcommander.Parameter;
import org.testng.annotations.*;
@Listeners(ExtentITestListenerAdapter.class)

public class TestBase {
    protected String browser;

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }

    @Parameters({"browser"})
    @BeforeClass
    protected void beforeClass(@Optional("chrome") String browser){
        System.out.println(browser + " browser");
        this.browser = browser;
    }
    @AfterClass
    protected void afterClass(){
        System.out.println("after class");
    }

    @BeforeTest
    protected void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    protected void afterTest(){
        System.out.println("after test");
    }

    @BeforeSuite
    protected void beforeSuit(){
        System.out.println("Before suit");
    }

    @AfterSuite
    protected void afterSuit(){
        System.out.println("After suit");
    }

    protected void log(Status status, String msg){
        ExtentTestManager.getTest().log(status, msg);
    }

    protected void logBrowser(){
        log(Status.INFO, "The browser used is: " + this.browser);
    }
}
