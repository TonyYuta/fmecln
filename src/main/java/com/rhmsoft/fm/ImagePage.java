package com.rhmsoft.fm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Yutaka on 5/9/17.
 */

import io.appium.java_client.AppiumDriver;

public class ImagePage extends Common {

    AppiumDriver driver;
    WebDriverWait wait;

    ImagePage(AppiumDriver driver) {
        this.driver = driver;
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /**
     * Navigate to Image page
     */
//    public void navigateToImagePage() throws NullPointerException {
    public void navigateToHomePage() throws NullPointerException, Exception {

        WebElement homeBtnEl = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
        homeBtnEl.click();
    }




}