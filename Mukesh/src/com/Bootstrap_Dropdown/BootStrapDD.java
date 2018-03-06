package com.Bootstrap_Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapDD {

	@Test
	public void BDD() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.id("menu1")).click();
		List<WebElement> ddList = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		
		//with Normal for loop
		/*	for(int i=0; i<=ddList.size(); i++){
			WebElement ele = ddList.get(i);
			String innerHTML=ele.getAttribute("innerHTML");
			if(innerHTML.contentEquals("JavaScript")) {
				ele.click();
				break;
			}
			System.out.println("Values from drop down are:"+innerHTML);
		}*/
		
		//with Enhanced for loop
		for(WebElement ele : ddList) {
			String innerHTML = ele.getAttribute("innerHTML");
			if(innerHTML.contentEquals("JavaScript")) {
				ele.click();
				break;
			}
			System.out.println("Values from Dropdrown are:"+innerHTML);
		}
		
		driver.quit();
	}
}
