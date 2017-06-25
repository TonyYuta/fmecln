package com.rhmsoft.fm;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Yutaka on 5/24/17.
 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ImageTest {

    AppiumDriver driver;
    HomePage homePage;
    Helper helper;
    ExtData extData;
    
    // xpath
    String searchBtnXpath;
    String homeBtnXpath;
    String recentBtnXPath;

    // id
    String recentBtn;
    String homeBtn;
    String imageBtn;
    String audioBtn;
    String videoBtn;
    String docBtn;
    String deviceBtn;
    String largeFilesBtn;
    String unnecessaryFilesBtn;
    String usedApkBtn;
    String installedAppsBtn;
    String allFilesBtn;
    String hotAppsNearby;
    

    public String getCapabilInfo() {
        return capabilInfo;
    }

    public void setCapabilInfo(String newCapabilInfo) {
        capabilInfo = newCapabilInfo;
    }

    // Capabilities
    private String capabilInfo;

    @BeforeMethod
//    public void setUp() throws Exception {
    public void setUp() throws IOException {
    	
        DesiredCapabilities capabilities = new DesiredCapabilities();
     //   capabilities.setCapability("deviceName", "AndroidTestDeviceNexus5");
        capabilities.setCapability("deviceName", "AndroidTestDevice01");
        capabilities.setCapability("app", "/Users/Yutaka/Documents/Mobile_Testing/Apk/com.rhmsoft.fm_v2.5.8-20580589_Android-4.0.apk");
        capabilities.setCapability("fullReset", "false");
        capabilities.setCapability("noReset", "true");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // creating instance of HomePage class
        homePage = new HomePage(driver);

        // creating instance of Helper class
        helper = new Helper(driver);

        // creating instance of ExtData class
        extData = new ExtData();
    }

    @AfterMethod
    public void tearDown() throws IOException {
        driver.quit();
    }
    
    /*--------------------Test Cases--------------------T*/
    /**
     */
    @Test(enabled = false, groups={"images", "dryrun", "regression", "all"})
    public void quantityImages() {
   // public void quantityImages() {
    	
    	//homePage = new HomePage(driver);
    	 
			homePage.navigateToImagePage();		 

/*        
        catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("================ NullPointerException ====================");

			e.printStackTrace();
		}
 */      
        
    	System.out.println("=========== quantityImages() end ==========");
    }

    @Test(enabled = true, groups={"images", "dryrun", "regression", "all"})
    public void quantityImages2() {
        homePage = new HomePage(driver);
		homePage.qqqMethodOnHomePage();		 
		System.out.println("================ quantityImages2() ======= end ====================");


    }

    @Test(enabled = false, groups={"images", "dryrun", "regression", "all"})
    public void quantityImages3() {
    }

    @Test(enabled = false, groups={"images", "dryrun", "regression", "all"})
    public void quantityImages4() {
    }



}
