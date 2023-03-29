package ui;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC05WindowsHandle {

	public static void main(String[] args)  throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");
        String wh = driver.getWindowHandle();
        System.out.println(wh);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
        Set <String> whs = driver.getWindowHandles();
        System.out.println(whs);
        Thread.sleep(3000);
        driver.switchTo().window(wh);
        Thread.sleep(3000);
        driver.quit();
       
       
	}

}
