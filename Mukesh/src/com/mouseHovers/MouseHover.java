package com.mouseHovers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {

	@Test
	public void mh() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		int totalLinks = links.size();
		for(int i=0; i<totalLinks; i++) {
			WebElement element = links.get(i);
			String text = element.getAttribute("innerHTML");
			boolean status = element.isEnabled();
			System.out.println("Link name:"+text+"and the link status is:"+status);
			if(text.equalsIgnoreCase("Appium")) {
				element.click();
				break;
			}
		}
	}
}
