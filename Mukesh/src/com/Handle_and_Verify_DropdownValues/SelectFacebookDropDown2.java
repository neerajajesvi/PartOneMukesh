package com.Handle_and_Verify_DropdownValues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectFacebookDropDown2 {

	@Test
	public void SelctDDValues() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement monthDD = driver.findElement(By.id("month"));
		Select mdd=new Select(monthDD);
		//It should return Oct as default selected value
		WebElement fopt = mdd.getFirstSelectedOption();
		String s1 = fopt.getText();
		System.out.println("Before Selection Default value is:"+fopt.getText());
		//select oct again
		mdd.selectByValue("10");
		WebElement fopt1 = mdd.getFirstSelectedOption();
		String s2 = fopt1.getText();
		System.out.println("After Selection the valuen is:"+fopt1.getText());
		Assert.assertEquals(s1, s2);
		System.out.println("Both are Same");
		driver.quit();
	}
}
