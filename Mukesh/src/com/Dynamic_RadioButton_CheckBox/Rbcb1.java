package com.Dynamic_RadioButton_CheckBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rbcb1 {
	@Test
	public void radio() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
        WebElement male_radio_button=driver.findElement(By.xpath("//div[1]/div[7]/span/span[2]/input"));
        boolean status=male_radio_button.isDisplayed();
        System.out.println("Male radio button is Displayed >>"+status);
        boolean enabled_status=male_radio_button.isEnabled();
        System.out.println("Male radio button is Enabled >>"+enabled_status);
        boolean selected_status=male_radio_button.isSelected();
        System.out.println("Male radio button is Selected >>"+selected_status);
        male_radio_button.click();
        boolean selected_status_new=male_radio_button.isSelected();
        System.out.println("Male radio button is Selected >>"+selected_status_new);
        driver.quit();
	}
}
