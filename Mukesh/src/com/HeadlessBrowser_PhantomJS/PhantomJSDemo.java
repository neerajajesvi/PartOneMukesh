package com.HeadlessBrowser_PhantomJS;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import com.library.Utility;

public class PhantomJSDemo {
	@Test
	public void FacebookTitle() throws IOException {
		//String path="E:\\STS\\jars\\Drivers\\phantomjs.exe";
		//System.setProperty("phantomjs.binary.path", "./drivers/phantomjs.exe");
		File src=new File("E:\\STS\\jars\\Drivers\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		WebDriver driver=new PhantomJSDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		Utility.captureScreenshot(driver,"PhantomJSDriverExample");
	}
}
