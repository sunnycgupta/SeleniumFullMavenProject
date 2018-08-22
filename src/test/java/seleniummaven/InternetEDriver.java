package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;



public class InternetEDriver {

	@Test
	public void runner() throws Exception {
		
		System.setProperty("webdriver.ie.driver","C:\\Sunny\\MicrosoftDriver\\MicrosoftWebDriver.exe");
	WebDriver driver=new InternetExplorerDriver();
			 
		driver.manage().window().maximize();
		 
		driver.get("http://www.google.com");
		WebElement tin=driver.findElement(By.name("q"));
		tin.sendKeys("Selenium"+Keys.ENTER);
		Thread.sleep(5000);
		driver.getTitle().contains("Selenium");
		driver.close();
		}
}
