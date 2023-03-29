package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	By txtUsername = By.name("user-name");
	By txtPassword = By.name("password");
    By btnLogin = By.name("login-button");
    
    WebDriver driver;
    public LoginPage(WebDriver d) {
    	driver = d;
    }
    
    public void set_Username(String username) {
    	driver.findElement(txtUsername).sendKeys(username);
    }
    public void set_Password(String password) {
    	driver.findElement(txtPassword).sendKeys(password);
    }
    public void click_Login() {
    	driver.findElement(btnLogin).click();
    }
}
