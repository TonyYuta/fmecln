package com.rhmsoft.fm;

/**
 * Created by Yutaka on 5/9/17.
 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {

    // Id
    public String homeBtnLoc = "com.rhmsoft.fm:id/new_home_title_tv";
    public String menuBtnLoc = "com.rhmsoft.fm:id/home_classify_text_images";

    AppiumDriver driver;
    WebDriverWait wait;


    /*
    Common(AppiumDriver driver) {
        this.driver = driver;
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    */


    /**
     * Navigate to Home page
     */
//    public void navigateToImagePage() throws NullPointerException {
    public void navigateToImagePage() throws NullPointerException {
       // WebElement homeBtnEl = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
        WebElement homeBtnEl = driver.findElement(By.id(homeBtnLoc));
        homeBtnEl.click();
    }

    /**
     * open Menu by tap on Menu Btn
     */
    public void openMenuByTapOnMenuBtn() {
       // WebElement menuBtn = driver.findElement(By.id("android:id/up"));
        WebElement menuBtnEl = driver.findElement(By.id(menuBtnLoc));
        menuBtnEl.click();
    }




}