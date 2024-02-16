package com.automation.testCases;

import org.testng.annotations.Test;

import com.automation.pages.BaseTest;
import com.automation.pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	void verifylogin() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		String username ="surenderkumar";
		String password ="Surender@123";
		lp.loginToPortal(username, password);
		Thread.sleep(5000);
		lp.logout();
		
		/*LoginPage lp = new LoginPage(driver);
		String username ="surenderprajapati1611@gmail.com";
		String password ="Surender@123";
		lp.loginPortal(username, password);*/
	}
}
