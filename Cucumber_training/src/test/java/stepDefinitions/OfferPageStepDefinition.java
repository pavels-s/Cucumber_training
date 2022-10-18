package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
public WebDriver driver;
public String offerPageProductName;
public String landingPageProductName;
TestContextSetup testContextSetup;
PageObjectManager pageObjectManager;

public OfferPageStepDefinition(TestContextSetup testContextSetup) {
	this.testContextSetup = testContextSetup;
}
	

@Then("User searched for same short name {string} in offers page")
public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {
	switchToOffersPage();
	
	OffersPage offersPage = testContextSetup.pageObjectManager.offersPage();
	offersPage.searchItem(shortName);
	//testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	Thread.sleep(2000);
	//Find element in table
	offerPageProductName = offersPage.getProductName();
	
}

public void switchToOffersPage() {
	//pageObjectManager = new PageObjectManager(testContextSetup.driver);
	//pageObjectManager.getLandingPage();
	LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
	//landingPageProductName = landingPage.getProductName();
	landingPage.selectTopDealsPage();
	testContextSetup.genericUtils.SwitchWindowTOChild();
}
	
@And("Validate product name on offers page matches product page in landing page")
public void validate_product_name_on_offers_page_and_landing_page() {
	Assert.assertEquals(offerPageProductName, testContextSetup.landingPageProductName);
}

}
