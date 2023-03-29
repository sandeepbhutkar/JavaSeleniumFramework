package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageLogin {
	
        By txtUserName =By.name("username");
        By txtPassword =By.name("password");
        By btnLogin = By.cssSelector("button[type='submit']");
	
		WebDriver driver;
		public pageLogin(WebDriver d) {
			driver = d;
		}	
			
		public void  setUserName(String userName) {
			driver.findElement(txtUserName).sendKeys(userName);
		}
		
		public void  setPassword(String Password) {
			driver.findElement(txtPassword).sendKeys(Password);
		}
		
		public void clickLogin() {
			driver.findElement(btnLogin).click();
		}
		

	

}
