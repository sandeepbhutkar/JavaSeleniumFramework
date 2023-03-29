package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static void captureScreenshot(WebDriver driver,String screenshotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\sbhutkar\\eclipse-workspace\\JavaSeleniumFramework3\\src\\test\\resources\\Screenshots\\"+screenshotName+".png");
		FileUtils.copyFile(src, trg);
		
	}

}
