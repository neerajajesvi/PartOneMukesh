package com.verifyBrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrockenLinks {

	@Test
	public void verifyBrockenLinks() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The total links are:"+links.size());
		for(int i=0; i<links.size(); i++) {
			WebElement ele=links.get(i);
			String url = ele.getAttribute("innerHTML");
			verifyLinkActive(url);
		}
	}
	public static void verifyLinkActive(String linkUrl) throws Exception {
		try {
			URL url=new URL(linkUrl);
			HttpURLConnection httpURLConnect=(HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();
			if (httpURLConnect.getResponseCode()==200) {
				System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage());
				if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
					System.out.println(linkUrl+"-"+httpURLConnect.getResponseCode()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
				}
			}
		} catch (Exception e) {
			
		}
	}
}
