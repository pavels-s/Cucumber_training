package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	@Given("^User is on banking landing page$")
	public void user_is_on_banking_landing_page() {
		//code to navigate user on landing page
		System.out.println("Testing if user is on landing page");
	}
	
	@When("^User login into application with username and password$") 
	public void user_login_into_application_with_username_and_password() {
		//login into application
		System.out.println("Logged in succesfully");
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated(){
		System.out.println("Home page is validated");
	}
	
	@And("^Cards are displayed$")
	public void cards_are_displayed() {
		System.out.println("Cards are validated");
	}
	
	
}
