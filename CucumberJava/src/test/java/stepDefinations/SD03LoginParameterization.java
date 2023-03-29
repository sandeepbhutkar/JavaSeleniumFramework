package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SD03LoginParameterization {
	
	WebDriver driver;
	
	@Given("user opens browser")
	public void user_opens_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();   
	}
	
	@Given("user is on sauce login page")
	public void user_is_on_sauce_login_page() {
		driver.get("https://www.saucedemo.com/");
	  
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username,String password) {
		
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
	 
	}
	@And("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.name("login-button")).click();
	
		
	  
	}

	@Then("user is logged in successfully")
	public void user_is_logged_in_successfully() {
		driver.findElement(By.cssSelector("a.shopping_cart_link")).isDisplayed();
	  
	}

	

}
