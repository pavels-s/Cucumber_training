package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/*
Do not use Background at the same time with Hook!
Appliable in a FEATURE FILE.
All given, when, then are located in stepDefinition file.

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started
*/

public class Example_Hooks {

	@Before("@MobileTest")
	public void beforeMobileValidation() {
		System.out.println("Before mobile hook");
	}
	
	@After("@MobileTest")
	public void afterMobileValidation() {
		System.out.println("After mobile hook");
	}
	
	@Before("@SmokeTest")
	public void beforeSmokeValidation() {
		System.out.println("Before mobile hook");
	}
	
	@After("@SmokeTest")
	public void afterSmokeValidation() {
		System.out.println("After mobile hook");
	}
	
}
