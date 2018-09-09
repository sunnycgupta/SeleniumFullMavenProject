package sunnyTestng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ClassOne {
	@Parameters({"url","pwd"})
	@Test
	public void amethodOne(String name,String pawd) {
		System.out.println("Hello I AM in A");
		System.out.println("parameter valuein Class one " + name);
		System.out.println("parameter valuein Class one  " + pawd);
	}
	
	@Test
	public void bmethodSecond() {
		System.out.println("Hello i am in B  ");
		//Assert.assertEquals(true, false);
	}
	@Parameters({"url","pwd"})
	@Test(dataProvider="tcdata")
	public void cmethodSix(String username,String password) {
		System.out.println("I am the username : " + username);
		System.out.println("I am the password : " + password);
	}
	
	@DataProvider(name="tcdata")
	public Object[][] getData() {
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="firstValue";
		data[0][1]="secondValue";
		
		data[1][0]="thirdValue";
		data[1][1]="fourthValue";
		data[2][0]="fifthValue";
		data[2][1]="sixthValue";
		return data;
	}
	
}
