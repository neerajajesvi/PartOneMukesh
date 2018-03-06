package com.CaptureScreenShotsOfFailedTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;

public class FacebookScreenShot {
	WebDriver driver;
	@Test
	public void captureScreenShot(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Learn Automation");
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {
		if(ITestResult.FAILURE==result.getStatus()) {
			Utility.captureScreenshot(driver, result.getName());
		}
		driver.quit();
	}
}
