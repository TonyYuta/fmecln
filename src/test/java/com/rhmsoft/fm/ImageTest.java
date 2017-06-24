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

    public String getCapabilInfo() {
        return capabilInfo;
    }

    public void setCapabilInfo(String newCapabilInfo) {
        capabilInfo = newCapabilInfo;
    }

    // Capabilities
    private String capabilInfo;

    @BeforeMethod
    public void setUp() throws Exception {

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
     * @throws IOException
     */
    @Test(enabled = true, groups={"images", "dryrun", "regression", "all"})
   // public void quantityImages() throws NullPointerException, IOException {
    public void quantityImages() throws IOException {
        homePage.navigateToImagePage();
    }

    @Test(enabled = false, groups={"images", "dryrun", "regression", "all"})
    public void quantityImages2() {
    }

    @Test(enabled = false, groups={"images", "dryrun", "regression", "all"})
    public void quantityImages3() {
    }

    @Test(enabled = false, groups={"images", "dryrun", "regression", "all"})
    public void quantityImages4() {
    }



}
