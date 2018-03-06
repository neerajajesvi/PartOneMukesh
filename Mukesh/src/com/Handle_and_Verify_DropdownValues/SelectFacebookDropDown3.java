package com.Handle_and_Verify_DropdownValues;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectFacebookDropDown3 {

	@Test
	public void SelctDDValues() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement monthDD = driver.findElement(By.id("month"));
		Select mdd=new Select(monthDD);
		List<WebElement> mlist = mdd.getOptions();
		int listSize = mlist.size();
		Assert.assertEquals(listSize, 13);
		System.out.println("Toatal Months are:"+listSize);
		for(WebElement ele : mlist) {
			String mName=ele.getText();
			System.out.println("Month Name is:"+mName);
		}
		driver.quit();
	}
}
