package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
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
	
	@When("^User login into application with username \"([^\"]*)\" and password \\\"([^\\\"]*)\\\"$") 
	public void user_login_into_application_with_username_and_password(String strArg1, String strArg2) {
		//login into application
		System.out.println("Logged in succesfully");
		System.out.println(strArg1);
		System.out.println(strArg2);
	}
	
	@When("^User login into application with following details$") 
	public void user_login_into_application_with_following_details(DataTable data) {
		//login into application
		System.out.println("Logged in succesfully");
		List<List<String>> obj = data.asLists();
		System.out.println(obj.get(0).get(0) + " " + obj.get(0).get(1));
	}
	
	@When("^User login into application with many (.+) and (.+)$") 
	public void user_login_into_application_with_many_parameters(String username, String password) {
		//login into application
		System.out.println("Logged in succesfully");
		System.out.println(username + " " + password);
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated(){
		System.out.println("Home page is validated");
	}
	
	
	@And("^Cards displayed \"([^\"]*)\"$")
	public void cards_are_displayed(String isTrue) {
		System.out.println("Cards are displayed = " + isTrue);
		System.out.println("----------------------------------");
	}
	
	
}
