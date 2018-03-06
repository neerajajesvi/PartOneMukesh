package com.Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesDemo2 {
	@Test
	public void testFrames() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///E:/STS/jars/html/Frames.html");
		int total_frames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(total_frames);
		WebElement my_frame = driver.findElement(By.xpath("//iframe[@title='selenium-news']"));
		driver.switchTo().frame(my_frame);
		driver.findElement(By.xpath(".//*[@id='menu_projects']/a")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("html/body/a")).click();
	}
}
