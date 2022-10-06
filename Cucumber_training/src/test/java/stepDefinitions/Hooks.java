package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/*
Do not use Background at the same time with Hook!
Appliable in a feature file.

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started
*/

public class Hooks {

	@Before("@MobileTest")
	public void beforeValidation() {
		System.out.println("Before mobile hook");
	}
	
	@After("@MobileTest")
	public void afterValidation() {
		System.out.println("After mobile hook");
	}
	
}
