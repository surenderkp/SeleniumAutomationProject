package com.automation.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.pages.BaseTest;
import com.automation.pages.LoginPage;
import com.automation.pages.SearchPage;
import com.automation.utilities.ReadExcelFile;

public class SearchTestCase extends BaseTest{
//	String filename =System.getProperty("user.dir")+"\\configuration\\DataProvider.xlsx";
	String filename = "D:\\Selenium_Automation_Project\\configuration\\DataProvider.xlsx";
		@Test
		void searchcoursetest() throws IOException {
			LoginPage lp = new LoginPage(driver);
			String username = ReadExcelFile.getcellValue(filename, "LoginData", 1, 0);
			String password = ReadExcelFile.getcellValue(filename, "LoginData", 1, 1);
			lp.loginToPortal(username, password);
			
			SearchPage sp = new SearchPage(driver);
			String courseName = ReadExcelFile.getcellValue(filename, "SearchCourse", 0, 0);
			sp.searchcourse(courseName);
			
		}
}
