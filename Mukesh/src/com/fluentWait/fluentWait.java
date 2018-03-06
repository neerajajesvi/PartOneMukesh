package com.fluentWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class fluentWait {

	@Test
	public void fWait() {		 
     // Start browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		//Waiting 30sec for an Element tobe present on the web page, checking for its presence once every 5 sec
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(250, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				WebElement ele = driver.findElement(By.xpath("//p[text()='WebDriver']"));
				String value = ele.getAttribute("innerHTML");
				if (value.equalsIgnoreCase("WebDriver")) {
					return ele;
				} else {
					System.out.println("Text which is coming on screen is:"+value);
					return null;
				}
			}
		});
		// If element is found then it will display the status
		System.out.println("Element is Displayed ?"+element.isDisplayed());
	}
}
