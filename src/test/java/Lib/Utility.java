package Lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
    
	
	
	public boolean loginToApplication()
	{
		
		return true;
	}
	
	public void logout()
	{
		
	}
	
	public static void captureScreenshot(WebDriver ldriver,String screenshot_name)
	{
		
		
       TakesScreenshot screenshot=(TakesScreenshot)ldriver;
		
		// it will store screenshot in memory
	    File src=screenshot.getScreenshotAs(OutputType.FILE);
		
		
	    try 
	    {
			FileUtils.copyFile(src, new File("C:\\LatestSeleniumDrivers\\"+screenshot_name+".png"));
		} 
	    catch (IOException e) 
	    {
		
	    	System.out.println("Unable to capture screeshot "+e.getMessage());
		}
		
	}
	
	
	public void highlightElements()
	{
		
	}
	
	
}
