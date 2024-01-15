package com.junit5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class GreetingImpleTestJunit5 {
	
	private Greeting greeting;


	@BeforeEach  //the different between @BeforeEach and @BeforeAll...before each will run after each test method beforeall will run only once that is ones for the entire test
	public void setUp() {		
		System.out.println("setup");
		greeting = new GreetingImple();
	}

	@Test
	public void greetShouldReturnValidOutput() {
		System.out.println("greetShouldReturnValidOutput");
		String result = greeting.greet1("vishal");
		Assertions.assertNotNull(result);//or simply assertNotNull(result)
		Assertions.assertEquals("Hellovishal", result);
	}
	
	
	@Test
	public void greetShldThrowAnException_ForNameIsNull() {
		System.out.println("greetShldThrowAnException_ForNameIsNull");
		//Assertions.assertThrows(expectedType, executable)--->syntax
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			greeting.greet1(null);
		});
		
	}
	
	
	@Test
	public void greetShldThrowAnException_ForNameIsBlank() {
		System.out.println("greetShldThrowAnException_ForNameIsBlank");
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			greeting.greet1("");
		});
		
		
	}
	
	@AfterEach//after each method nnn after all means after all the tests are executed that the clean up will be invoked
	public void cleanUp() {
		System.out.println("cleanUp");
		greeting = null;
	}
	//the above junit4 will run as we have added vintage support in junit5


}


//if u dont find run as junit add 2 dependencies junit-platform-runner and junit-jupiter-apu and mark the class with @RunWith(JunitPlatform.class)

/*
 @RunWith(JunitPlatform.class)
 public class GreetingImpleTestJunit5 {

 */



