package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Factory {

	public static WebDriver driver;
	
	
	public static WebDriver Start_Browser(String browserName,String Url){

		if((browserName).equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if((browserName).equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunny.c.gupta\\Documents\\Selenium_setup_files\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if((browserName).equalsIgnoreCase("InternetExplorer"))
		{
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\sunny.c.gupta\\Documents\\Selenium_setup_files\\IEDriverServer.exe");
		    driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		return driver;
	}
	
}
