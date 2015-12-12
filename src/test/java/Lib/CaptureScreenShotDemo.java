package Lib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShotDemo {

	public static void main(String[] args) throws IOException
	{
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.learn-automation.com");
			
		Utility.captureScreenshot(driver, "shekhar");
		
		Utility.captureScreenshot(driver, "shekhar1");
		
		Utility.captureScreenshot(driver, "shekhar2");
		
		Utility.captureScreenshot(driver, "shekhar3");
		
		Utility.captureScreenshot(driver, "shekhar4");
		
		

	}

}
