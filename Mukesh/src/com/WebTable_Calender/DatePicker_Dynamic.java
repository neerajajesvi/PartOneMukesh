package com.WebTable_Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_Dynamic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		Thread.sleep(3000);
		//It will store all Elements in a list
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table//td"));
		int total_node = dates.size();
		for(int i=0; i<total_node; i++) {
			String date = dates.get(i).getText();
			if(date.equalsIgnoreCase("30")) {
				dates.get(i).click();
				break;
			}
		}
	}
}
