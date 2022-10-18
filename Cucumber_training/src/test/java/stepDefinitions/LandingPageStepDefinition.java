package stepDefinitions;

import java.util.Iterator;
import java.util.Set;
import utils.TestContextSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition{
public WebDriver driver;
public String landingPageProductName;
TestContextSetup testContextSetup;
	

public LandingPageStepDefinition(TestContextSetup testContextSetup) {
	this.testContextSetup = testContextSetup;
}

@Given("User is on GreenCard landing page")
public void user_is_on_green_card_landing_page() {
	//System.setProperty("webdriver.chrome.driver","/JavaGuru/Soft/chromedriver.exe");
	//testContextSetup.driver = new ChromeDriver();
	//testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
}
	

@When("User searched with short name {string} and extracted actual name of product")
public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
	LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
	landingPage.searchItem(shortName);

	Thread.sleep(2000);
	testContextSetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
	System.out.println(landingPageProductName + " is extracted from Home page");  
}
	



}
