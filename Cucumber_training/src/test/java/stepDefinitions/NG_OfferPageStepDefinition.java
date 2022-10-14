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
import utils.NG_TestContextSetup;

public class NG_OfferPageStepDefinition {
public WebDriver driver;
public String offerPageProductName;
NG_TestContextSetup testContextSetup;

public NG_OfferPageStepDefinition(NG_TestContextSetup testContextSetup) {
	this.testContextSetup = testContextSetup;
}
	

@Then("User searched for same short name {string} in offers page")
public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {
	testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
	
	Set<String> s1 = testContextSetup.driver.getWindowHandles();
	//Setting collection with both opened windows - parent and just opened child
	Iterator<String> i1 = s1.iterator();
	//Autom. retrieve window with index 0
	String parentWindow = i1.next();
	//Retrieve second, child windows ID
	String childWindow = i1.next();
	//Switching to child window thru its ID
	testContextSetup.driver.switchTo().window(childWindow);
	testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	Thread.sleep(2000);
		
	//Find element in table
	offerPageProductName = testContextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
}
	
@And("Validate product name on offers page matches product page in landing page")
public void validate_product_name_on_offers_page_and_landing_page() {
	Assert.assertEquals(offerPageProductName, testContextSetup.landingPageProductName);
}

}
