package com.sunny;


import java.io.File;
import java.lang.ref.PhantomReference;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import Utilities.Get_Screenshot;
import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class Test2Sun {
	@Test
	public  void manuplate() {
		
		File src=new File("C:\\Sunny\\phantomjs\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		WebDriver driver=new PhantomJSDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		Get_Screenshot.capture_Screenshot(driver, "newone");
		driver.close();
	}
}
