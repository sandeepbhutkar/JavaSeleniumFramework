package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SD02GoogleSearchSteps {
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	}

	@Given("user is on Google Page")
	public void user_is_on_google_page() {
		driver.get("https://www.google.com");
	    
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
	    
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	    
	}

	@Then("search results are displayed")
	public void search_results_are_displayed() {
		String actual = driver.getTitle();
		String expected = "Automation Testing - Google Search";
		if (actual.equalsIgnoreCase(expected)) {
			System.out.println("Pass");
		}
		else {
				System.out.println("Fails");
			}
		driver.close();
		}
		
	    
	

}
