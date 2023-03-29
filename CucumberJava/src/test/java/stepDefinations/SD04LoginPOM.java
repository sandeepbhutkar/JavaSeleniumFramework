package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class SD04LoginPOM {
	
	WebDriver driver;
	LoginPage lp ;
	@Given("user opens browser1")
	public void user_opens_browser1() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();   
	}
	
	@Given("user is on sauce login page1")
	public void user_is_on_sauce_login_page1() {
		driver.get("https://www.saucedemo.com/");
	  
	}

	@When("user enter credentials")
	public void user_enter_credentials() {
		lp = new LoginPage(driver);
		lp.set_Username("standard_user");
		lp.set_Password("secret_sauce");
		
	 
	}
	@And("user click on login button1")
	public void user_click_on_login_button1() {
		lp.click_Login();
		
	  
	}

	@Then("user is logged in successfully1")
	public void user_is_logged_in_successfully1() {
		driver.findElement(By.cssSelector("a.shopping_cart_link")).isDisplayed();
	  
	}

	

}
