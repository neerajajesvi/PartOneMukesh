package com.Dynamic_RadioButton_CheckBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RbCb {

	@Test
	public void radioAndCheck(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		for(int i=0; i<radio.size(); i++) {
			WebElement localRadio = radio.get(i);
			String value = localRadio.getAttribute("value");
			System.out.println("Value from Radio button:"+value);
			if(value.equals("RUBY")) {
				localRadio.click();
			}
		}
		
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0; i<checkBox.size(); i++) {
			WebElement cb = checkBox.get(i);
			String id = cb.getAttribute("id");
			System.out.println("Check box id is:"+id);
			if(id.equalsIgnoreCase("code")) {
				cb.click();
				break;
			}
		}
		driver.quit();
	}
}
