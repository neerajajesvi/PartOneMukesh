package com.HighLightEement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.library.HighLight;

public class HighLightDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(By.xpath(".//*[@id='email']"));
		HighLight.highLigthElement(driver, un);
		un.sendKeys("umakvdu@gmail.com");
		
		WebElement pw = driver.findElement(By.xpath(".//*[@id='pass']"));
		HighLight.highLigthElement(driver, pw);
		pw.sendKeys("@Uma.123#");
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		HighLight.highLigthElement(driver, loginBtn);
		loginBtn.click();
	}

}
