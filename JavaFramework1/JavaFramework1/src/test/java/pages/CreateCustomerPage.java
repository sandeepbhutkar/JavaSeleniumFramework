package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCustomerPage {
	
	By linkCustomers = By.cssSelector("i.nav-icon.far.fa-user");
	By linkSubCustomers = By.xpath("//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/p[1]");
	By btnAddNew = By.cssSelector("a.btn.btn-primary");
	By txtEmail = By.cssSelector("#Email");
	By txtPassowrd = By.cssSelector("#Password");
	By txtFirstName = By.cssSelector("#FirstName");
	By txtLastName = By.cssSelector("#LastName");
	
	WebDriver driver;
	public CreateCustomerPage(WebDriver d) {
		driver = d;
	}
	
	public void clickCustomersTab() {
		driver.findElement(linkCustomers).click();
	}
		
	public void clickCustomersSubTab(){
		driver.findElement(linkSubCustomers).click();
	}
	
	public void clickAddNewButton() {
		driver.findElement(btnAddNew).click();
	}
	
	public void setEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
	}
	
	public void setPassword(String pass) {
		driver.findElement(txtPassowrd).sendKeys(pass);
	}
	
	public void setFirstName(String firstname) {
		driver.findElement(txtFirstName).sendKeys(firstname);
	}
	
	public void setLastName(String lastname) {
		driver.findElement(txtLastName).sendKeys(lastname);
	}
	
	
	
	
	
	
	
	

}
