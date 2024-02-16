package com.automation.utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	public static WebDriver StartApplication(WebDriver driver, String browserName , String appUrl) {
		
		if(browserName.equals("Chrome")) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\ChromeDriver");
		ChromeOptions op = new ChromeOptions();
		driver = new ChromeDriver(op);	
		}
		
		
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/geckodriver.exe");
	         driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/IEDriverServer.exe");
	         driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("We do not support this browser ");
		}

		
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		return driver;

	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
			
}



