package utilities;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Get_Screenshot {
	
	
	public static void capture_Screenshot(WebDriver driver,String screenshotName) {
		
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("C:\\Sunny\\Screenshot\\"+screenshotName+".png"));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
