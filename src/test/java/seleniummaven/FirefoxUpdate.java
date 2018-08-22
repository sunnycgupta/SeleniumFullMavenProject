package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxUpdate {

	@Test
	public void runner() throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:\\Sunny\\Setup\\geckodriver\\geckodriver.exe");
	
		WebDriver driver=new FirefoxDriver();
			 
		driver.manage().window().maximize();
		 
		driver.get("http://www.google.com");
		WebElement tin=driver.findElement(By.name("q"));
		tin.sendKeys("Selenium"+Keys.ENTER);
		Thread.sleep(5000);
		driver.getTitle().contains("Selenium");
		driver.close();
		}
		
}
