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
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition{
public WebDriver driver;
public String landingPageProductName;
public CheckoutPage checkoutPage;
TestContextSetup testContextSetup;
	

public CheckoutPageStepDefinition(TestContextSetup testContextSetup) {
	this.testContextSetup = testContextSetup;
	this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
}
	

@Then("Verify user has ability to enter promo code and place the order")
public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
	checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	Assert.assertTrue(checkoutPage.verifyPromoBtn());
	Assert.assertTrue(checkoutPage.verifyPlaceOrder());
}

@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$") 
public void user_proceeds_to_Checkout_and_validate_the_name_items_in_checkout_page(String name) throws InterruptedException {
	checkoutPage.checkOutItems();
	//Assertion to extract name from table and compare with name
	Thread.sleep(2000);
}
	



}
