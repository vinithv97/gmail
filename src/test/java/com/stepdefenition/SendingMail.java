package com.stepdefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.objectrepository.LoginPagePOM;
import com.objectrepository.SendMessagePOM;
import com.objectrepository.SentMail;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendingMail extends FunctionalLibrary {
	LoginPagePOM lp= new LoginPagePOM();
	SendMessagePOM sm=new SendMessagePOM();
	SentMail st=new SentMail();

	@Given("I enter dummy Username")
	public void I_enter_dummy_Username() {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   insertText(lp.getUsername(),"sampleprog10@gmail.com");
	}

	@Given("I click next button")
	public void I_click_next_button() {
	   click(lp.getNextBtn());
	}

	@Given("I enter pw")
	public void I_enter_pw() {
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.elementToBeClickable(lp.getPasswd()));
		 insertText(lp.getPasswd(),"123Qwerty!@");
	}

	@Given("user click nextSec")
	public void user_click_nextSec() {
	   click(lp.getNextSec());
	}

	@Given("I click compose button and maximize the tab")
	public void I_click_compose_button_and_maximize_the_tab() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    click(sm.getComposeBtn());
	    click(sm.getMaximize());
	}

	@When("I enter valid receiver address and subject")
	public void I_enter_valid_receiver_address_and_subject() {
	   insertText(sm.getToAdd(),"vinith@gmail.com");
	   insertText(sm.getSubject(),"sample");
	   insertText(sm.getMessage(),"Hello");
	}

	@When("I click on send button")
	public void I_click_on_send_button() {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   click(sm.getSendBtn());
	}

	@When("I click on sent tab")
	public void I_click_on_sent_tab() {
	    click(st.getSentBtn());
	}

	@When("click on the sent mail")
	public void click_on_the_sent_mail() {
	   click(st.getClickMail());
	}

	@Then("I verify the sent mail status")
	public void I_verify_the_sent_mail_status() {
		getText(st.getVerify(),"not sent");
	}
	

}
