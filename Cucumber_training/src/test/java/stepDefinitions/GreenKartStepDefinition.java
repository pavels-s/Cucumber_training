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

public class GreenKartStepDefinition {
public WebDriver driver;
public String landingPageProductName, offerPageProductName;
	
	@Given("User is on GreenCard landing page")
	public void user_is_on_green_card_landing_page() {
		System.setProperty("webdriver.chrome.driver","/JavaGuru/Soft/chromedriver");
	    driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    
	}
	
	
	@When("User searched with short name {string} and extracted actual name of product")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortName) {
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	    landingPageProductName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	    System.out.println(landingPageProductName + " is extracted");
	    
	}
	
	
	@Then("User searched for same shortname {string} in offers page")
	public void user_searched_for_same_shortname_in_offers_page(String shortName) {
		driver.findElement(By.linkText("Top Deals")).click();
		Set <String> s1 = driver.getWindowHandles();
		Iterator <String> i1 = s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.id("search-field")).sendKeys(shortName);
		
		offerPageProductName = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	}
	
	@And("Validate product name in offers page validates product page in landing page")
	public void validate_product_name_on_offers_page_and_landing_page() {
		Assert.assertEquals(offerPageProductName, landingPageProductName);
	}

}
