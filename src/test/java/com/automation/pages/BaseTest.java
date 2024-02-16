package com.automation.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ConfigDataProvider;

public class BaseTest {
	public WebDriver driver;
	ConfigDataProvider config = new ConfigDataProvider();
	
	@BeforeClass
	public void setup() {
		driver= BrowserFactory.StartApplication( driver,  config.getBrowser(), config.getStagingUrl());
	}
	
	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}
	 public void captureScreenShot(WebDriver driver,String testName) throws IOException
	 {
		 // Convert webDriver object to TakesScreenshot interface
		 TakesScreenshot screenshot= ((TakesScreenshot)driver);
		 
		 // Step 2 :call getScreenshotAs method to capture image file
		 
		 File src= screenshot.getScreenshotAs(OutputType.FILE);
		 File srcpath=new File("."+"//Screenshots//"+"login" + ".png");
		 
		 // Step 3 : copy image file to destination 
		 FileUtils.copyFile(src, srcpath);
		 
	 }
}
