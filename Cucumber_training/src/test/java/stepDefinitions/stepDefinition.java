package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	@Given("^User is on banking landing page$")
	public void user_is_on_banking_landing_page() {
		//code to navigate user on landing page
	}
	
	@When("^User login into application with username and password$") 
	public void user_login_into_application_with_username_and_password() {
		//login into application
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated(){
		
	}
	
	@And("^Cards are displayed$")
	public void cards_are_displayed() {
		
	}
	
	
}
