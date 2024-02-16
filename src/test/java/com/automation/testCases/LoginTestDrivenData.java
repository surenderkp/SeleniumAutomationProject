package com.automation.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.pages.BaseTest;
import com.automation.pages.LoginPage;
import com.automation.utilities.ReadExcelFile;

  public class LoginTestDrivenData extends BaseTest {
	String filename ="D:\\Selenium_Automation_Project\\configuration\\DataDriven.xlsx";

	@Test(dataProvider="LoginDataProvider")
	void verifylogin(String username, String password) throws IOException {

		LoginPage lp=new LoginPage(driver);
	//	String username ="Demo12";
	//	String password ="Test123456$";
		lp.loginToPortal(username, password);
		
	//	lp.logout(); only when test case is passed...
		
		if(username.equals("surenderkumar") && password.equals("Surender@123"))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
			lp.logout();
		}
		else
		{
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);
		}
		
		/*LoginPage lp = new LoginPage(driver);
		String username ="surenderprajapati1611@gmail.com";
		String password ="Surender@123";
		lp.loginPortal(username, password);*/
	}


	@DataProvider(name="LoginDataProvider")
		public String[][] LoginDataProvider() throws IOException
	{
		int ttlRows= ReadExcelFile.getrowcount(filename, "LoginData");
		int ttlColumns= ReadExcelFile.getcellcount(filename, "LoginData");
		
		String data[][]= new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++)
		{
			for(int j=0;j<ttlColumns;j++)
			{
				data[i-1][j]=ReadExcelFile.getcellValue(filename, "LoginData", i, j);
				System.out.println(data[i-1][j]);
			}
		}
		return data;	}
}