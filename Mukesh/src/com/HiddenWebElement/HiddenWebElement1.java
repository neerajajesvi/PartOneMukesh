package com.HiddenWebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenWebElement1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		//Case: 1
		
		/*int x = driver.findElement(By.id("male")).getLocation().getX();
		int y = driver.findElement(By.id("male")).getLocation().getY();
		System.out.println("x Coordinate: "+x);
		System.out.println("y Coordinate: "+y);*/
		
		//Case: 2
		
		/*List<WebElement> radio = driver.findElements(By.id("male"));
		int count = radio.size();
		System.out.println("Total radio Buttons: "+count);
		for(int i=0; i<count; i++) {
			WebElement ele = radio.get(i);
			int x = ele.getLocation().getX();
			//int x = radio.get(i).getLocation().getX();
			if(x!=0) {
				ele.click();
				break;
			}
		}*/
		
		//Case: 3
		
		driver.findElement(By.name("lang")).click();
	}

}
