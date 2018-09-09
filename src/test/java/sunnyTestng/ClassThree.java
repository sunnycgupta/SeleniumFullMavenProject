package sunnyTestng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {
	@Test
	public void aMethodOne() {
		System.out.println("Hello I AM in  class 3 A");
	}
	
	@Parameters({"url"})
	@Test
	public void bMethodSecond(String three) {
		System.out.println("Hello i am in class 3 B  ");
		System.out.println("Parameter value in 3rd class"  + three);
	}
	
	@Test
	public void cMethodSix() {
		System.out.println("I am in clss 3 C  ");
	}
	
}
