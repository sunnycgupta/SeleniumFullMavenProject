package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ChangeDownloadPath {

	@Test
	public static void changePath() throws InterruptedException {
		

		//Set the path of the Chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sunny.c.gupta\\Documents\\Selenium_setup_files\\chromedriver.exe");
		
		// Select the path of folder where you need to store the file
        String downloadFilepath = "C:\\Users\\sunny.c.gupta\\Documents\\Selenium_download\\";
        
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		
		chromePrefs.put("profile.default_content_settings.popups", 0);
		
		chromePrefs.put("download.default_directory", downloadFilepath);
		
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("prefs", chromePrefs);
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriver driver = new ChromeDriver(cap);
		
		//Give the Url for the Website from where you need to navigate
		driver.get("http://www.contextures.com/xlSampleData01.html");
		
		//Search the button clicking on which the file is downloaded
		driver.findElement(By.partialLinkText("Excel sample")).click();
		
		// to wait for the FIle to download depending on the size
		 Thread.sleep(5000);
		

	  //Give the location of downloaded file
		/*File src=new File("C:\\Users\\sunny.c.gupta\\Documents\\Selenium_download\\SampleData\\TestData.xlsx");
		try {
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheetAt(0);	
			String data=sheet1.getRow(1).getCell(1).getStringCellValue();			
			System.out.println("The value of the Cell is " + data);
			wb.close();
			
		} catch (Exception e) {
			System.out.println(e);;
		}*/
		
	}

}
