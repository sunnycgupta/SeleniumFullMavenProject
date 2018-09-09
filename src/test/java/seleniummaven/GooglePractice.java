package seleniummaven;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GooglePractice {
	@Test
	public void run() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Sunny\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18886/eng-vs-ind-4th-test-india-tour-of-england-2018");
		WebElement table=driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[3]"));
		int colsize=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int sum=0;
		
		for(int i=0;i<colsize-2;i++) {
			String val=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int vals=Integer.parseInt(val);
			sum=sum+vals;
		}
		System.out.println("Totsl Runs by bats :" + sum);
		String extra=driver.findElement(By.xpath("(//div[text()='Extras']/following-sibling::div)[3]")).getText();
		int extrascore=Integer.parseInt(extra);
		int finalscore=sum+extrascore;
		String total= driver.findElement(By.xpath("(//div[text()='Total']/following-sibling::div)[3]")).getText();
		int totalsum=Integer.parseInt(total);
		boolean b=false;
		Assert.assertEquals(finalscore, totalsum);
		b=true;
		if(b) {
			System.out.println("Count Matches");
		}
		//driver.close();
	}
}



/*		
 * 	Auto suggestion
 * driver.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
	
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		

		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value";
		String inner=(String) js.executeScript(script);
		int i=0;
		while(!inner.equalsIgnoreCase("BENLURU INTERNATION AIPORT")) {
			
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			
			inner=(String) js.executeScript(script);
			System.out.println(inner);
			
			i++;
			if(i>10) {
				System.out.println("Beaking loop");
				break;
			}
		}
		if(i>10) {
			System.out.println("Element Not found");
		}
 * 	Frames
 * 
		int framesize=driver.findElements(By.tagName("iframe")).size();
		
		for(int i=0;i<framesize;i++) {
			
			driver.switchTo().frame(i);
			
			int isPresent=driver.findElements(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).size();
			if(isPresent>0) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
				
				break;
			}
			}
 * 
 * 	driver.get("https://www.path2usa.com/travel-companions");
 * 		Handle tabel dynamicaaly 
 * 		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().contains("April")) {
			
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}
		
		List<WebElement> al=driver.findElements(By.className("day"));
		
		for(int i=0;i<al.size();i++) {
			String text=al.get(i).getText();
			if(text.equals("18")) {
				al.get(i).click();
			break;
			}
		}
		Thread.sleep(5000);	
 * 		Links in a web page
 *		 Dimension d=new Dimension(350,760);
		driver.manage().window().setSize(d);
 * 		driver.get("http://www.qaclickacademy.com/practice.php");
		
		List<WebElement> al=driver.findElements(By.tagName("a"));
		System.out.println(al.size());
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		List<WebElement> al1=footer.findElements(By.tagName("a"));
		
		for(int i=1;i<al1.size();i++) {
			String clickhold=Keys.chord(Keys.CONTROL,Keys.ENTER);
			al1.get(i).sendKeys(clickhold);
			Thread.sleep(5000);
		}
		Set<String> see=driver.getWindowHandles();
		Iterator<String> itr=see.iterator();
		while(itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
		
 * 		Flight booking
 * 		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()=' Goa (GOI)']")).click();

		driver.findElement(By.xpath("(//a[text()=' Jammu (IXJ)'])[2]")).click();
		List<WebElement> rado=driver.findElements(By.xpath("//input[@name='group1']"));
		Thread.sleep(5000);
		for(int i=0;i<rado.size();i++) {
			System.out.println(rado.get(i).getAttribute("value"));
			rado.get(i).click();
		}
		// action
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		Actions action=new Actions(driver);
		
		WebElement elen=driver.findElement(By.id("nav-your-amazon"));
		action.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		Thread.sleep(5000);
		action.moveToElement(elen).contextClick().sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		window handle
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		* Handling frames
		* 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Thread.sleep(5000);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(5000);
		driver.quit();
*/
