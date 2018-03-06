package com.Handle_and_Verify_DropdownValues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookDropDown {

	@Test
	public void SelctDDValues() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement monthDD = driver.findElement(By.id("month"));
		Select mdd=new Select(monthDD);
		//select march
		mdd.selectByIndex(3);
		Thread.sleep(2000);
		//select oct
		mdd.selectByValue("10");
		Thread.sleep(2000);
		mdd.selectByVisibleText("Aug");
		Thread.sleep(2000);
		driver.quit();
	}
}
