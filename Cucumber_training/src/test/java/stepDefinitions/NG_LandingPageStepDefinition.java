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

public class NG_LandingPageStepDefinition {
public WebDriver driver;
public String landingPageProductName, offerPageProductName;
	

@Given("User is on GreenCard landing page")
public void user_is_on_green_card_landing_page() {
	System.setProperty("webdriver.chrome.driver","/JavaGuru/Soft/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
}
	

@When("User searched with short name {string} and extracted actual name of product")
public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortName) {
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	landingPageProductName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	System.out.println(landingPageProductName + " is extracted from Home page");  
}
	



}
