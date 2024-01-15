package com.training;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.GreetingImple;

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
		String result = greeting.greet("vishal");
		assertNotNull(result);
		assertEquals("Hellovishal", result);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void greetShldThrowAnException_ForNameIsNull() {
		System.out.println("greetShldThrowAnException_ForNameIsNull");
		greeting.greet(null);
		
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void greetShldThrowAnException_ForNameIsBlank() {
		System.out.println("greetShldThrowAnException_ForNameIsBlank");
		greeting.greet("");
		
	}
	
	@After
	public void cleanUp() {
		System.out.println("cleanUp");
		greeting = null;
	}
	


}


/*
output:Test Method can run in any order but first set up then test method then cleanup
	setup
	greetShldThrowAnException_ForNameIsNull
	cleanUp
	setup
	greetShouldReturnValidOutput
	cleanUp
	setup
	greetShldThrowAnException_ForNameIsBlank
	cleanUp
	*/


//The method marked with @Before run once for the entire test class--false
