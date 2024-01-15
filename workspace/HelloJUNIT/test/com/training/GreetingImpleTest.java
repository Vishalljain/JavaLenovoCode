package com.training;
import static org.junit.Assert.*;

import org.junit.Test;

import com.training.GreetingImple;

public class GreetingImpleTest {

	@Test
	public void greetShouldReturnValidOutput() {
		Greeting greeting = new GreetingImple();//--------------->1
		String result = greeting.greet("vishal");
		System.out.println(result);
		assertNotNull(result);
		assertEquals("Hellovishal", result);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void greetShldThrowAnException_ForNameIsNull() {
		Greeting greeting = new GreetingImple();//--------------------->2
		greeting.greet(null);
		
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void greetShldThrowAnException_ForNameIsBlank() {
		Greeting greeting = new GreetingImple();//------------------------->3
		greeting.greet("");
		
	}
	
	//1,2,3 we have created 3 times the object Greeting greeting = new GreetingImple();
	
	//so we will use  @Before and use the object before @test runs

}
