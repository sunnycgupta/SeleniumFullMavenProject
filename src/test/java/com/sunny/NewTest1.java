package com.sunny;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void fuu() {
	 
	  for(int i=1;i<=100;i++) {
		  if(i%3==0) {
			  System.out.println("Hi");
			  continue;
		  }
		  System.out.println(i);
	  }
  }
}
