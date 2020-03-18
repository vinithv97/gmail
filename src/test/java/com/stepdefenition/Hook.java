package com.stepdefenition;

import com.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends FunctionalLibrary{
	
	@Before
	public void beforeBackground() {
       
		launch("https://accounts.google.com/signin");
		driver.manage().window().maximize();

	}
	
	@After
	public void afterScenario() {
		
		driver.close();

	}

}
