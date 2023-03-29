package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	By txtEmail = By.cssSelector("#Email");
	By txtPassword = By.cssSelector("#Password");
	By btnButton = By.cssSelector("button.button-1.login-button");

	
	
	WebDriver driver;
	public LoginPage(WebDriver d) {
		driver = d;
	}
	
	public void setEmail(String email) {
		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys(email);
	}
	
	public void setPassword(String password) {
		driver.findElement(txtPassword).clear();
		driver.findElement(txtPassword).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(btnButton).click();
	}
	

}
