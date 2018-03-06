package com.bootStrapLoginOrPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrap {

	@Test
	public void bootstrapLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.goibibo.com/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		driver.findElement(By.id("authUsername")).sendKeys("Uma");
	}
}
