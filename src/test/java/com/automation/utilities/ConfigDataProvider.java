package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
Properties pro;
String filelocation= "D:\\Selenium_Automation_Project\\configuration\\config.properties";
File f1 = new File(filelocation);
public ConfigDataProvider() {
	try {
		FileInputStream fis= new FileInputStream(f1);
		pro = new Properties();
		pro.load(fis);
	}
	catch(Exception e){
		System.out.println("Not able to load confid file" + e.getMessage());
	}
}	
	public String getBrowser() {
		return pro.getProperty("browser");
	}
	public String getStagingUrl() {
		return pro.getProperty("testurl");
	}
}

