package com.WebTable_Calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_Static {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[contains(@class,'current day firepath-matching-node')]")).click();
	}
}
