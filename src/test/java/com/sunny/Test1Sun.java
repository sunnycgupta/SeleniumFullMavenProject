package com.sunny;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1Sun {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	@Parameters("sBrowser")
	public void launchBrowser(String sBrowser){
		
		if(sBrowser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Sunny\\chromedriver\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://www.google.com");
		}else if(sBrowser.equals("edge")){
			System.setProperty("webdriver.edge.driver","C:\\Sunny\\Setup\\MicrosoftWebDriver.exe");
			 driver=new EdgeDriver();
			 driver.get("http://www.google.com");
		}
	}
	@Test	
	public void tc_1() throws InterruptedException{
		
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
	}
	@Test	
	public void tc_2() throws InterruptedException{
		
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
}
