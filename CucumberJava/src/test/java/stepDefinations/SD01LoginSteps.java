package stepDefinations;

import io.cucumber.java.en.*;

public class SD01LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("user is on login page1");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password1");
	}
	   

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button1");
	   
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user is navigated to the home page1");
	    
	}


}
