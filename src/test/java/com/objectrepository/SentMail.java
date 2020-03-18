package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class SentMail extends FunctionalLibrary {
	public SentMail() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@title='Sent']")
	private WebElement sentBtn;
	
	@FindBy(xpath="//table[@id=':jk']//preceding-sibling::tr")
	private WebElement clickMail;
	
	
	@FindBy(xpath="//span[contains(text(),'Mail Delivery Subsystem')]")
	private WebElement verify;


	public WebElement getSentBtn() {
		return sentBtn;
	}


	public WebElement getClickMail() {
		return clickMail;
	}


	public WebElement getVerify() {
		return verify;
	}
	

}
