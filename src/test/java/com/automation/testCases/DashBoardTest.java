package com.automation.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.pages.BaseTest;
import com.automation.pages.DashBoardPage;
import com.automation.pages.LoginPage;
import com.automation.utilities.ReadExcelFile;

public class DashBoardTest extends BaseTest{
	String filename = "D:\\Selenium_Automation_Project\\configuration\\DataProvider.xlsx";
	@Test
	void dashboardsetup() throws IOException, InterruptedException {
		LoginPage lp = new LoginPage(driver);
		String username = ReadExcelFile.getcellValue(filename, "LoginData", 1, 0);
		String password = ReadExcelFile.getcellValue(filename, "LoginData", 1, 1);
		lp.loginToPortal(username, password);
		
		DashBoardPage db = new DashBoardPage(driver);
		db.dashboard();
		
	}
	

}
