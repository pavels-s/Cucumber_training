package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class NG_TestContextSetup {
	
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	
	public TestContextSetup() {
		pageObjectManager = new PageObjectManager(driver);
	}

}
