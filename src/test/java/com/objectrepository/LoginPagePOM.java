package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class LoginPagePOM extends FunctionalLibrary{
	
	public LoginPagePOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="identifierId")
	private WebElement username;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement nextBtn;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwd;
	
	@FindBy(xpath="//div[@class='qhFLie']//following-sibling::span")
	private WebElement nextSec;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getNextSec() {
		return nextSec;
	}
	
	
	
}
