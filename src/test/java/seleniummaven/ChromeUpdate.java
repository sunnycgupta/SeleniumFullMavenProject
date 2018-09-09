package seleniummaven;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class ChromeUpdate {
	public static Logger log=LogManager.getLogger(ChromeUpdate.class.getName());
public static WebDriver driver;
	@Test
	public void runner() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Sunny\\chromedriver\\chromedriver.exe");
	
		 driver=new ChromeDriver();
		 log.info("Starting Browser"); 
		driver.manage().window().maximize();
		 
		driver.get("http://www.google.com");
		WebElement tin=driver.findElement(By.name("q"));
		tin.sendKeys("Selenium"+Keys.ENTER);
		log.info("value  Browser");
		Thread.sleep(5000);
		driver.getTitle().contains("Selenium");
		Assert.assertFalse(true);
		log.info("Fail Browser");
		driver.close();
		}
		
	public void getScreenshot(String screenshotName) {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(src, new File("C:\\Sunny\\Screenshot\\"+screenshotName+".png"));
			} catch (Exception e) {
				System.out.println(e);
			}
	}
	
}
