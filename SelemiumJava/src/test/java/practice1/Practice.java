package practice1;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {
	
	WebDriver driver;
	public String url = "https://testautomationpractice.blogspot.com/";
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();	
	}
	
	@Test
	public void alert() throws InterruptedException{
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		String at = driver.switchTo().alert().getText();
		System.out.println(at);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);	
	}
	
	@Test
	public void date() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("datepicker")).click();	
		for (int i=0;i<=100;i++) {		
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();											
		}
	    driver.findElement(By.xpath("//a[contains(text(),'14')]")).click();
		Thread.sleep(2000);	
	}
	
	@Test
	public void dropDown() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement drp = driver.findElement(By.xpath("//select[@id='animals']"));
		
		Select select = new Select(drp);
		select.selectByIndex(2);
		
		//to print selected option
		System.out.println("First selected option is: " +select.getFirstSelectedOption().getText());
		
		
		//print all values
		List<WebElement> ao = select.getOptions();
		System.out.println("All drop down options are: ");
		for (int i = 0;i<=ao.size()-1;i++) {
			System.out.println(ao.get(i).getText());
		
			
		}
		
		
	}
	
	@Test
	public void getText() {
		WebElement gt = driver.findElement(By.xpath("//span[contains(text(),'Message#### 1234567')]"));
		System.out.println(gt.getText());
	}
	
	@Test
    public void table() {
		//getRows
		List<WebElement> rc = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div/div[1]/table/tbody/tr"));
		System.out.println("Number of rows:"+ rc.size());
		//getRows
		List<WebElement> cc = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div/div[1]/table/tbody/tr[2]/td"));
		System.out.println("Number of columns:"+ cc.size());
		//print table
		for(int i = 2; i<=rc.size(); i++) {
			for (int j=1; j<=cc.size(); j++) {
				System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div/div[1]/table/tbody/tr["+ i +"]/td["+ j +"]")).getText());
				
			}
		}
		System.out.println();
    	
    }
	
	@Test
	public void actions() throws InterruptedException {
		//mouse hover
		Actions actions = new Actions(driver);
		WebElement mte = driver.findElement(By.id("age"));
		actions.moveToElement(mte).perform();
		Thread.sleep(2000);
		//double click
		WebElement dc = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		actions.doubleClick(dc).perform();
		Thread.sleep(2000);
		//right click
		WebElement cc = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		actions.contextClick(cc).perform();
		Thread.sleep(2000);
		//drag drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		//slider
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		actions.dragAndDropBy(slider, 50, 0).perform();
		Thread.sleep(2000);
		//scroll
		WebElement e = driver.findElement(By.xpath("//a[contains(text(),'Blogger')]"));
		actions.scrollToElement(e).perform();
		Thread.sleep(2000);		
	}
	
	@Test
	public void links() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links are: "+links.size());
		System.out.println("Links:");
		for(int i = 0;i<=links.size()-1;i++) {
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
			
		}
		
	}
	
	@Test
	public void windowsHandles() throws InterruptedException {
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
	}
	
	@Test
	public void explicitWait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.urlToBe("https://testautomationpractice.blogspot.com/"));
		
		
	}
	
	@Test
	public void keyBoard() throws InterruptedException {
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Tester");
		Thread.sleep(2000);
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);	
		
	}

}
