package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03BasicWebdriverMethods {
    
	public static String browser = "edge";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
	    }
	    else if (browser.equals("edge")) {
	    	WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
	    }
	driver.get("https://www.saucedemo.com/");
	String cur_url = driver.getTitle();
	System.out.print(cur_url);
	    if (cur_url.equals("Swag Labs")) {
	    	System.out.println("Test Passed");
	    }
	    else {
	    	System.out.println("Test Failed");
	    }	
	 driver.navigate().to("https://www.google.com");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 driver.close();
//Selenium WebDriver Tutorial #15 - Basic Methods in WebDriver Interface - Part 2
	

	}

}
