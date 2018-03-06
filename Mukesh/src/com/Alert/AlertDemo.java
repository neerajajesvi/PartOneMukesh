package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertDemo {

	@Test
	public void handleAlert() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(5000);
		//Alert alt = driver.switchTo().alert();
		//alt.accept();
		String actual_msg = driver.switchTo().alert().getText();
		System.out.println("Alert message is: "+actual_msg);
		driver.switchTo().alert().accept();
		String expected_msg = "Please select start place.";
		Assert.assertEquals(actual_msg, expected_msg);
	}
}
