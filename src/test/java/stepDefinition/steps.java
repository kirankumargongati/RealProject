package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	@Given("the user is on the nopCommercepage")
	public void the_user_is_on_the_nop_commercepage() {
	  
	}

	@When("the user enters valid credentials\\(username: {string}, password: {string}")
	public void the_user_enters_valid_credentials_username_password(String string, String string2) {
	    
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
	   
	}

	@Then("the user should be redirected to the My Account page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
	    
	}

	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
	    
	}
}
