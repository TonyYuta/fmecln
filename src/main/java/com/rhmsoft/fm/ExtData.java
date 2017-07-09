package com.rhmsoft.fm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import io.appium.java_client.AppiumDriver;

/**
 * Created by aolyva on 5/10/17.
 */
public class ExtData {

    AppiumDriver driver;
    Properties pro;
    HashMap<String, String> locators;
    Map<String, String> map;

    
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
    ExtData() {
    	
    	try {
    
    		locators = new HashMap();
    		
	        // Specify the file location I used . operation here because
	        //we have object repository inside project directory only
	        File file = new File("src/test/resources/locators.properties");
	
	        // Create  FileInputStream object
	        FileInputStream fis;
	        fis = new FileInputStream(file);
		
	        // Create Properties class object to read properties file
	        pro = new Properties();
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
         
	         locators.put("el01Key", "el01val");
	         
	         
	        // Map<String, String> map = new HashMap(pro);
	         map = new HashMap(pro);
	         
	
	         
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	


  }
    
    public void printMap() {
        ExtData ed = new ExtData();
        System.out.println("===========================");
    	System.out.println(map);
        System.out.println("===========================");

    }
    
}