package pawanInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC18DatePicker {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement month_drp = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select select = new Select(month_drp);
		select.selectByVisibleText("Jan");
		WebElement year_drp = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select2 = new Select(year_drp);
		select2.selectByVisibleText("1987");
		driver.findElement(By.cssSelector("a[data-date='15']")).click();
		
	}

}
