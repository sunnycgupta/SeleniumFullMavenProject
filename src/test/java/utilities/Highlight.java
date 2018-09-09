package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlight {

	public static void highlightElement(WebDriver driver,WebElement Element){
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border: 2px solid red;');",Element);
		try{
			Thread.sleep(500);
		}
		catch(Exception e){
			System.out.println("style not set");
		}
		js.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid white')", Element);
		
	}
}
