package com.rhmsoft.fm;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Yutaka on 5/24/17.
 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ImageTest {

    AppiumDriver driver;
    
    DesiredCapabilities capabilities;
    
    // creating instance of Helper class
    Helper helper;
    
    // creating instance of Common class
    Common common;
    
    // creating instance of HomePage class
    HomePage homePage;
    
    // creating instance of ExtData class
    ExtData extData;
    
    // creating instance of ImagePage class
    ImagePage imagePage;
    

    
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
    public String capabilInfo;

    //@BeforeMethod
    //@BeforeMethod(alwaysRun = true)
    @BeforeClass(alwaysRun = true)
      public void setUp() throws IOException {
    	
    	System.out.println("======================= @BeforeMethod === starts ===== line 76 ========================");       

        //DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities = new DesiredCapabilities();
     //   capabilities.setCapability("deviceName", "AndroidTestDeviceNexus5");
        capabilities.setCapability("deviceName", "AndroidTestDevice01");
        capabilities.setCapability("app", "/Users/Yutaka/Documents/Mobile_Testing/Apk/com.rhmsoft.fm_v2.5.8-20580589_Android-4.0.apk");
        capabilities.setCapability("fullReset", "false");
        capabilities.setCapability("noReset", "true");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        // creating instance of Common class
        common = new Common(driver);
        
        // creating instance of HomePage class
        homePage = new HomePage(driver);
        
        // creating instance of Helper class
        imagePage = new ImagePage(driver); 
        
        // creating instance of Helper class
        helper = new Helper(driver); 
        
        // creating instance of ExtData class
        ExtData extData = new ExtData();
        
    	System.out.println("======================= @BeforeMethod ===   end   === line 98 ========================");
   }

    @AfterClass
    public void tearDown() throws IOException {
        driver.quit();
    }
    
    /*--------------------Test Cases--------------------T*/
	/**
     * @throws Exception 
     * @throws NullPointerException 
     */
    @Test(enabled = true, groups={"images", "dryrun", "regression", "all"}, priority=0)
    public void quantityImages() throws NullPointerException, Exception {
    	int expected = 3;
    	int actual;
		int cameraRollQtyPict = 0;
    	homePage.openImagePage();
    	System.out.println("=========== quantityImages() ======== 124  ======");
    	actual = imagePage.cameraRollQty();
    	System.out.println("=========== cameraRollQtyPict: " + cameraRollQtyPict + " ======");
    	System.out.println("=========== quantityImages() end ==== 127 ======");
    	Assert.assertEquals(expected, actual);
    }
    
    @Test(enabled = true, groups = {"home", "dryrun", "regression", "all"}, priority=1)
    public void navigateToHomePage() {

    }
    

}
