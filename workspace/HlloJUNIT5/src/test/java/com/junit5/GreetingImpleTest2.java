package com.junit5;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class GreetingImpleTest2 {
	
	private Greeting greeting;


	@Before
	public void setUp() {//which will be exceuted before each of these test methods setup method will run 3 times because we have 3 test method in here
		System.out.println("setup");
		greeting = new GreetingImple();
	}

	@Test
	public void greetShouldReturnValidOutput() {
		System.out.println("greetShouldReturnValidOutput");
		String result = greeting.greet1("vishal");
		assertNotNull(result);
		assertEquals("Hellovishal", result);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void greetShldThrowAnException_ForNameIsNull() {
		System.out.println("greetShldThrowAnException_ForNameIsNull");
		greeting.greet1(null);
		
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void greetShldThrowAnException_ForNameIsBlank() {
		System.out.println("greetShldThrowAnException_ForNameIsBlank");
		greeting.greet1("");
		
	}
	
	@After
	public void cleanUp() {
		System.out.println("cleanUp");
		greeting = null;
	}
	


}


//junit4 test case are running in junit5 due to vintage dependency added in junit5 pom.xml...vintage allows junit4 testcases to run in junit5 project