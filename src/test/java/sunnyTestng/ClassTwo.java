package sunnyTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ClassTwo {

	
	@Test
	public void methodThree() {
		System.out.println("Gupta ");
	}
	
	@Test
	public void methodFour() {
		System.out.println("Dudee ");
	//	Assert.assertEquals(true, false);
	}
	
	@Test
	public void methodSkip() {
		System.out.println("Skipped ");
	}
	
	@Test
	public void methodSkkip() {
		System.out.println("SkippedOne ");
	}
	
	@AfterSuite
	public void methodSkkkip() {
		System.out.println("I am the Last ");
	}
	
	@BeforeMethod
	public void methodSkkkipy() {
		System.out.println("I am the first Baby ");
	}
	
	@Test(groups={"smoke"})
	public void methodSkkkipys() {
		System.out.println("I am the After Baby ");
	}
	
	@Test(groups={"smoke"})
	public void methodSkkkipyst() {
		System.out.println("I am the Before class ");
	}
	
	@Test(groups={"smoke"})
	public void methodSkkkipystr() {
		System.out.println("I am the After class ");
	}
}
