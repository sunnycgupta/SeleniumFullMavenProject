package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LoadingProprerty {
	public WebDriver driver;
	@Test
	public void loadProperty() throws Exception {
		
		File src=new File("C:\\Users\\himanshu\\workspace\\SunnyFullMavenProject\\config.properties");
		FileInputStream fis=new FileInputStream(src);
		Properties pro=new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("browser"));
		
		if(pro.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Sunny\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(pro.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Sunny\\Setup\\geckodriver\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.ie.driver","C:\\Sunny\\MicrosoftDriver\\MicrosoftWebDriver.exe");
			driver=new InternetExplorerDriver();
		}
		
		
		driver.get("http://www.google.com");
	}
}
