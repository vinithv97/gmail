package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class SendMessagePOM extends FunctionalLibrary{
	public SendMessagePOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[text()='Compose']")
	private WebElement composeBtn;
	
	@FindBy(id=":db")
	private WebElement maximize;
	
	@FindBy(id=":gr")
	private WebElement toAdd;
	
	@FindBy(xpath="(//input[@name='subjectbox'])[2]")
	private WebElement subject;
	
	@FindBy(id=":he")
	private WebElement message;
	
	@FindBy(id=":fz")
	private WebElement sendBtn;

	public WebElement getComposeBtn() {
		return composeBtn;
	}

	public WebElement getMaximize() {
		return maximize;
	}

	public WebElement getToAdd() {
		return toAdd;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getSendBtn() {
		return sendBtn;
	}
}
