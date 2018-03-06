package com.GenerateLogfiles;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {

	public static void main(String[] args) {
		Logger logger=Logger.getLogger("LogDemo"); 
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		logger.info("Chrome Opened");
		driver.manage().window().maximize();
		logger.info("rowser Maximized");
		driver.get("http://www.ksrtc.in/oprs-web/");
		logger.info("App launched");
		driver.findElement(By.id("searchBtn")).click();
		logger.info("Click on Search Button");
		//Alert alt = driver.switchTo().alert();
		//alt.accept();
		String actual_msg = driver.switchTo().alert().getText();
		logger.info("Capture the test");
		System.out.println("Actual message: "+actual_msg);
		driver.switchTo().alert().accept();
		logger.info("Accept Alert Window");
	}

}
