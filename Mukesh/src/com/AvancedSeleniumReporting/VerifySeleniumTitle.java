package com.AvancedSeleniumReporting;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifySeleniumTitle {

	@Test
	public void verifyTitle() {
		ExtentReports logger=ExtentReports.get(VerifySeleniumTitle.class);
		logger.init("E:\\STS\\work\\Mukesh\\Reports\\Report.html", true);
		
		logger.startTest("Verify Page Title");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		logger.log(LogStatus.INFO, "Browser Is Up And Running");
		
		driver.get("http://learn-automation.com/");
		
		logger.log(LogStatus.INFO, "Application Is Up And Running");
		
		String title = driver.getTitle();
		
		logger.log(LogStatus.INFO, "Title Captured");
		
		Assert.assertTrue(title.contains("Selenium"));
		
		logger.log(LogStatus.INFO, "Title is Verified");
		
		logger.attachScreenshot("./ScreenShots/captureScreenShot.PNG");
		
		logger.endTest();
	}
}
