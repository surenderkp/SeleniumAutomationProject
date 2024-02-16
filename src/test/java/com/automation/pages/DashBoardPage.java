package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;
	public DashBoardPage(WebDriver Idriver) {
		this.driver = Idriver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"login-list\"]/li[1]/a") WebElement dash;
	@FindBy(xpath="//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a") WebElement offerdcourse;
	@FindBy(xpath="//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button") WebElement subscribeNow;
	@FindBy(xpath="//*[@id=\"learn-press-payment\"]/div[1]/div/div[1]/label") WebElement choosepymtduration;
	@FindBy(xpath="//*[@id=\"learn-press-payment\"]/div[3]/div/div/span[2]/label") WebElement monthly;
	@FindBy(xpath="//*[@id=\"learn-press-payment\"]/ul/li/label") WebElement paytm;
	@FindBy(xpath="//*[@id=\"learn-press-checkout-place-order\"]") WebElement paynow;

	public void dashboard() throws InterruptedException {
		dash.click();
		offerdcourse.click();
		subscribeNow.click();
		Thread.sleep(5000);
		choosepymtduration.click();
		monthly.click();
		Thread.sleep(5000);
		paytm.click();
		Thread.sleep(5000);
		paynow.submit();
		Thread.sleep(5000);
	}


}