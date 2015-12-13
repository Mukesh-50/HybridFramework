package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Pages.LoginPage;

public class LoginWordpress 
{
	
	WebDriver driver;
	@Test
	public void verifyLoginWordpress()
	{

	  // Start firefox Session	
	  driver=BrowserFactory.getBrowser(driver,"firefox");
		
		
	  driver.get("http://demosite.center/wordpress/wp-login.php");
	  
	
	  // Initialize page object elements  
	   LoginPage login=PageFactory.initElements(driver, LoginPage.class);
	  
	   
	   login.login_Wordpress("admin", "demo123");
	   
	   
	  
	 /*  login.verifyPageTitle();
	   
	   login.typeUserName("admin");
	   
	   login.typePassword("demo123");
	   
	   login.clickLoginButton();*/
	   
	   
	   BrowserFactory.closeBrowser(driver);
	   
	}
	
}
