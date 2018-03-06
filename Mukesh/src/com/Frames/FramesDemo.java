package com.Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesDemo {
	@Test
	public void testFrames() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///E:/STS/jars/html/Frames.html");
		
		driver.switchTo().frame("act3");
		driver.findElement(By.id("fittext2")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("html/body/a")).click();
	}
}
