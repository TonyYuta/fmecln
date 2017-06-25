package com.rhmsoft.fm;

/**
 * Created by Yutaka on 5/9/17.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class HomePage {

    AppiumDriver driver;
    WebDriverWait wait;

    ExtData extData;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /*
    public void navigateToImagePage() throws NullPointerException {

       // WebElement imageBtn = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
        WebElement imageBtnEl = driver.findElement(By.id(imageBtnLoc));
        imageBtnEl.click();

    }
    */

 //   elementLocator
    public void navigateToImagePage() {
    //public void navigateToImagePage() throws FileNotFoundException {
//        WebElement imageBtn = driver.findElement(By.id(extData.imageBtn));
        WebElement imageBtn = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
        
       // imageBtnLoc=com.rhmsoft.fm:id/home_classify_text_images

        imageBtn.click();
    }

    public void qqqMethodOnHomePage() {
		System.out.println("================ quantityImages2() ======= end ====================");
    }


}