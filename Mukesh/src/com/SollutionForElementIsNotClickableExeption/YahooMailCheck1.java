package com.SollutionForElementIsNotClickableExeption;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooMailCheck1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		
		//driver.findElement(By.id("persistent")).click(); //By.id thows an exception when click on check box
		//Using different xpath
		//driver.findElement(By.xpath("//p[2]/span[1]/label")).click();
		
		//Using Mouse Hovers
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("persistent"))).click().build().perform();
	}

}
