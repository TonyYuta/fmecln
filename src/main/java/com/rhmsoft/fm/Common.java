package com.rhmsoft.fm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Yutaka on 5/9/17.
 */

import io.appium.java_client.AppiumDriver;

public class Common {

    // Id
    public String homeTabOnHomePageLoc = "com.rhmsoft.fm:id/new_home_title_tv";
    public String imageBtnLoc = "com.rhmsoft.fm:id/home_classify_text_images";

    AppiumDriver driver;
    WebDriverWait wait;
    
    
    Common(AppiumDriver driver) {
        this.driver = driver;
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    

    /**
     * open Image Page by tap on Image Btn
     */
    public void openImagePage() throws NullPointerException, Exception {
    	System.out.println("================ Common ======= openImagePage() === starts ==== 35 ========================");       
        WebElement imageBtnEl = driver.findElement(By.id(imageBtnLoc));
    	System.out.println("================ Common ======= openImagePage() =============== 37 ========================");       
        imageBtnEl.click();
    	System.out.println("================ Common ======= openImagePage() ===   end  ==== 39 ========================");       
    }

    /**
     * open Home Page by tap on Menu Tab
     */
    public void navigateToHomePage() {
    	WebElement homeBtnEl = driver.findElement(By.id(homeTabOnHomePageLoc));
    	homeBtnEl.click();
    }

    


}