package com.AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadMultiple {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/STS/jars/Gourav_AutoIT/fileupload.html");
		driver.findElement(By.id("a1")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("E:\\STS\\jars\\Gourav_AutoIT\\MultipleFiles.exe"+" "+"E:\\STS\\jars\\Gourav_AutoIT\\CV.doc");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("a1")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("E:\\STS\\jars\\Gourav_AutoIT\\MultipleFiles.exe"+" "+"E:\\STS\\jars\\Gourav_AutoIT\\RESUME.doc");
	}
}
