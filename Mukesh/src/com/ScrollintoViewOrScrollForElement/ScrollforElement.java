package com.ScrollintoViewOrScrollForElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollforElement {
	@Test
	public void  scrolling() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//Identify the element which will appear after scroll down
		WebElement ele = driver.findElement(By.xpath("//div[3]/div[1]/div/p[3]"));
		//Now Execute query which actually will scroll until that element is not appeared
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		//extract the and verify
		System.out.println(ele.getText());
	}
}