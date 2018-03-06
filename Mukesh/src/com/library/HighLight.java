package com.library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLight {
	
	public static void highLigthElement(WebDriver driver, WebElement element) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 2px solid red;');", element);
		
		//Delay for Half sec
		try {
			Thread.sleep(500);
		} 
		//UnHilight
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid white');", element);
	}
}
