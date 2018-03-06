package com.MultipleWindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID is: "+parent);
		Set<String> allWindows = driver.getWindowHandles();
		int count=allWindows.size();
		System.out.println("Total Windows: "+count);
		for (String child : allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Child Window Title is: "+driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parent Window Title is: "+driver.getTitle());
		driver.quit();
	}

}
