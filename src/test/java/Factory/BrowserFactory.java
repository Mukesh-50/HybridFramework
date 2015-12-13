package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{

	//static WebDriver driver;
	
	
	public static WebDriver getBrowser(WebDriver driver,String browsername)
	{
		
	
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		else if(browsername.equalsIgnoreCase("Chrome"))
		{
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	
	public static  void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
}
