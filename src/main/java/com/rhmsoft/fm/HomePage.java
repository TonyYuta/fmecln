package com.rhmsoft.fm;

import java.io.FileNotFoundException;
import java.io.IOException;

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
    //public void navigateToImagePage() throws IOException {
    public void navigateToImagePage() throws FileNotFoundException, NullPointerException {

			try {
				extData = new ExtData();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        WebElement imageBtn = driver.findElement(By.id(extData.imageBtn));
        imageBtn.click();
    }



}