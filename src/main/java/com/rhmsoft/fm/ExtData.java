package com.rhmsoft.fm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.appium.java_client.AppiumDriver;

/**
 * Created by aolyva on 5/10/17.
 */
public class ExtData {

    AppiumDriver driver;


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


    /**
     * @throws IOException
     */
    //ExtData() throws IOException {
    ExtData() throws IOException {

        // Specify the file location I used . operation here because
        //we have object repository inside project directory only
        File file = new File("src/test/resources/locators.properties");

        // Create  FileInputStream object
        FileInputStream fis;
		fis = new FileInputStream(file);

        // Create Properties class object to read properties file
        Properties pro = new Properties();
		pro.load(fis);
	
        // xpath
         searchBtnXpath = pro.getProperty("searchBtnXpathLoc");
         homeBtnXpath = pro.getProperty("homeBtnXpathLoc");
         recentBtnXPath = pro.getProperty("recentBtnXPathLoc");

        // id
         recentBtn = pro.getProperty("recentBtnLoc");
         homeBtn = pro.getProperty("homeBtnLoc");
         imageBtn = pro.getProperty("imageBtnLoc");
         audioBtn = pro.getProperty("audioBtnLoc");
         videoBtn = pro.getProperty("videoBtnLoc");
         docBtn = pro.getProperty("docBtnLoc");
         deviceBtn = pro.getProperty("deviceBtnLoc");
         largeFilesBtn = pro.getProperty("largeFilesBtnLoc");
         unnecessaryFilesBtn = pro.getProperty("unnecessaryFilesBtnLoc");
         usedApkBtn = pro.getProperty("usedApkBtnLoc");
         installedAppsBtn = pro.getProperty("installedAppsBtnLoc");
         allFilesBtn = pro.getProperty("allFilesBtnLoc");
         hotAppsNearby = pro.getProperty("hotAppsNearbyLoc");
         
    }



}
