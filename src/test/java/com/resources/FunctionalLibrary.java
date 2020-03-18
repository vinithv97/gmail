package com.resources;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	
	public void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinith\\eclipse-workspace\\Mail\\target\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

	}
	
	public void insertText(WebElement element,String value) {
		element.sendKeys(value);

	}
	
	public void click(WebElement element) {	
		element.click();
		
	}
	
	public void getText(WebElement element, String value) {	
		Assert.assertTrue(element.isDisplayed());
		System.out.println(value);

	}
}
