package com.rhmsoft.fm;

/**
 * Created by Yutaka on 5/9/17.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage {



    AppiumDriver driver;
    WebDriverWait wait;

    ExtData extData;

    HomePage(AppiumDriver driver) {
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
    public void navigateToImagePage() throws IOException {
        extData = new ExtData();
        WebElement imageBtn = driver.findElement(By.id(extData.imageBtn));
        imageBtn.click();
    }



}