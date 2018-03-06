package com.CaptureScreenShot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.library.Utility;

public class FacebookScreenshot1 {

	@Test
	public void captureScreenshot() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Utility.captureScreenshot(driver, "BrowserStarted");
		driver.findElement(By.id("email")).sendKeys("Learn Automation");
		Utility.captureScreenshot(driver, "facebook1");
		driver.quit();
	}
}
