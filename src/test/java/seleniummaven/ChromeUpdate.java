package seleniummaven;

import java.lang.ref.PhantomReference;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChromeUpdate {
	@Test
	public void runner() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Sunny\\chromedriver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
			 
		driver.manage().window().maximize();
		 
		driver.get("http://www.google.com");
		WebElement tin=driver.findElement(By.name("q"));
		tin.sendKeys("Selenium"+Keys.ENTER);
		Thread.sleep(5000);
		driver.getTitle().contains("Selenium");
		driver.close();
		}
		
	
	
}
