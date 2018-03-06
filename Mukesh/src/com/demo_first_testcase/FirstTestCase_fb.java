package com.demo_first_testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTestCase_fb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("selenium");
		driver.findElement(By.id("pass")).sendKeys("WebDriver");
		Select s1=new Select(driver.findElement(By.id("day")));
		s1.selectByIndex(10);
		Select s2=new Select(driver.findElement(By.id("month")));
		s2.selectByValue("12");
		Select s3=new Select(driver.findElement(By.id("year")));
		s3.selectByVisibleText("1989");
		driver.findElement(By.xpath("//div[1]/div[7]/span/span[1]/input")).click();
		driver.findElement(By.xpath("//div[1]/div[7]/span/span[2]/input")).click();
		driver.findElement(By.xpath("//tr[2]/td[3]/label/input")).click();
		driver.navigate().back();
		driver.quit();
	}

}
