package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods 
{
	//UNDER UTILITIES NO LOCATORS PRESENT
	//Step1-: Declare WEBDRIVER INSTANCE
	WebDriver wd = new FirefoxDriver();

	    //Common methods
		//Maximize the Browser
		public void Maximize_window() 
		{
			wd.manage().window().maximize();
		}
		//Delete all Cookies
		public void Delete_coockies_from_browser() 
		{
			wd.manage().deleteAllCookies();;
		}
		//Navigate Back
		public void Navigate_back() 
		{
			wd.navigate().back();;
		}
		//Navigate Forward
		public void Navigate_forward() 
		{
			wd.navigate().forward();
		}
		//Refresh The Page
		public void Navigate_refresh() 
		{
			wd.navigate().refresh();;
		}
		//Wait Statement using thread.sleep
		public void Please_wait() throws InterruptedException 
		{
			Thread.sleep(2000);
		}
		//Scroll Down
		//Alert & iFrame
		//Close Application
		public void close_browser() 
		{
			wd.close();;
		}
	
}

