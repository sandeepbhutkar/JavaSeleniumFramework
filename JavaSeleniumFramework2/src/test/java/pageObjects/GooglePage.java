package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {
	
	By txtSearch = By.name("qd");
	
	WebDriver driver;
	public GooglePage(WebDriver d) {
		driver = d;
	}
	
	public void setSearch(String txt) {
		driver.findElement(txtSearch).sendKeys(txt);
	}

}
