'package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TestLogin {

    String driverPath = "/Users/apple/Desktop/John's/Selenium Setup Files/geckodriver";
    
    WebDriver driver;

    LoginPage objLogin;

    HomePage objHomePage;
    
    String appUrl="http://demo.guru99.com/V4/";

    @BeforeTest

    public void setup(){

    	System.setProperty("webdriver.firefox.marionette",driverPath);
		
		final FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setPreference("xpinstall.signatures.required", false);
		driver = new FirefoxDriver();
        driver.get(appUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MICROSECONDS);

    }

 

    @Test(priority=0)

    public void test_Home_Page_Appear_Correct(){

        //Create Login Page object

    objLogin = new LoginPage(driver);

    //Verify login page title

    String loginPageTitle = objLogin.getLoginTitle();

    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

    //login to application

    objLogin.loginTo("mgr123", "mgr!23");

    // go the next page

    objHomePage = new HomePage(driver);

    //Verify home page

    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

    }
    }