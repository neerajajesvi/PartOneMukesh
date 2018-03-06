package com.verifyErrorMessages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMsg {

	@Test
	public void verifyTitle() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://gmail.com/");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Using getText() method
		//String actual = driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getText();
		//Using getAttribute() method
		String actual = driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getAttribute("innerHTML");
		String expected="Enter an email or phone number";
		Assert.assertEquals(actual, expected);
		Assert.assertTrue(actual.contains("Enter an email or phone number"));
		System.out.println("Test completed");
		driver.quit();
	}
}
