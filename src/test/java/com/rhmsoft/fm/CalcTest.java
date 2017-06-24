package com.rhmsoft.fm;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Unit test for Calc.
 */
public class CalcTest {
	
	// drivers
    AppiumDriver driver;
    WebDriverWait wait;
    
    // Id
    public String homeBtnLoc = "com.rhmsoft.fm:id/new_home_title_tv";
    public String menuBtnLoc = "com.rhmsoft.fm:id/home_classify_text_images";
    
//    @BeforeMethod
//    public void setUp() throws Exception {
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//     //   capabilities.setCapability("deviceName", "AndroidTestDeviceNexus5");
//        capabilities.setCapability("deviceName", "AndroidTestDevice01");
//        capabilities.setCapability("app", "/Users/Yutaka/Documents/Mobile_Testing/Apk/com.rhmsoft.fm_v2.5.8-20580589_Android-4.0.apk");
//        capabilities.setCapability("fullReset", "false");
//        capabilities.setCapability("noReset", "true");
//
//        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }

    @AfterMethod
    public void tearDown() throws IOException {
        driver.quit();
    }
	
    
  //  public void navigateToImagePage() throws NullPointerException {
    public void navigateToImagePage() {
         WebElement homeBtnEl = driver.findElement(By.id(homeBtnLoc));
         homeBtnEl.click();
     }

     public void openMenuByTapOnMenuBtn() {
        // WebElement menuBtn = driver.findElement(By.id("android:id/up"));
         WebElement menuBtnEl = driver.findElement(By.id(menuBtnLoc));
         menuBtnEl.click();
     }
     
     
     /*--------------------Test Cases--------------------T*/

     /**
      * @throws NullPointerException
      * @throws IOException
      */
     @Test(enabled = true, groups={"images", "dryrun", "regression", "all"})
     public void quantityImages() throws NullPointerException, IOException {

         DesiredCapabilities capabilities = new DesiredCapabilities();
         capabilities.setCapability("deviceName", "AndroidTestDevice01");
         capabilities.setCapability("app", "/Users/Yutaka/Documents/Mobile_Testing/Apk/com.rhmsoft.fm_v2.5.8-20580589_Android-4.0.apk");
         capabilities.setCapability("fullReset", "false");
         capabilities.setCapability("noReset", "true");
         driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         WebElement homeBtnEl = driver.findElement(By.id(homeBtnLoc));
         homeBtnEl.click();        
     }

    
     
     
     // =========== working TCs ====================

    @Test(enabled = true, groups = {"add","allcalc"}, priority=0)
    public void test_add() {
        Assert.assertEquals(Calc.add(2, 2), 4);
    }

    @Test(enabled = true, groups = {"subtract","allcalc"}, priority=1)
    public void test_subtract() {
        Assert.assertEquals(Calc.subtract(4, 2), 2);
    }
    @Test(enabled = true, groups = {"multiply","allcalc"}, priority=2)
    public void test_multiply() {
        Assert.assertEquals(Calc.multiply(3, 3), 9);
    }
    @Test(enabled = true, groups = {"divide","allcalc"}, priority=3)
    public void test_divide() {
        Assert.assertEquals(Calc.divide(6, 3), 2);
    }
    @Test(enabled = true, expectedExceptions = ArithmeticException.class, groups = {"division","allcalc"}, priority=4)
    public void test_divide_by_0() {
        Assert.assertEquals(Calc.divide(2, 0), 0);
    }
    @Test(enabled = true, groups = {"allcalc"}, priority=4)
    public void test_object() {
        Calc o = new Calc();
    }
    
    


   



     
     
}
