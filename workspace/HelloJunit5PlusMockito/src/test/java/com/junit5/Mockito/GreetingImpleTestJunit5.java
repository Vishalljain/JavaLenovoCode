package com.junit5.Mockito;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;


//@ExtendWith(MockitoExtension.class)
//This extendswith annotation is from Junit.This annotation allows other libraries like Mockito to extend the junit framework and we can mark 
//our test classes and test methods if required with @Extend annotation and use a class from that library in this case will be using MockitoExtension.class.This
//Mockito extension knows how to provide mocking functionality while writing unit tests.

//@Mock
//private GreetingService service;
//@InjectMocks
//private GreetingImpl greeting;----->we dont want to use new operator create th instance


//if you simply mark any object declaration with @mock annotation, this Mockito.extension class will mock that object for u.you can then inject that object into the class under test @InjectMock annotation.It will mock the GreetingService and it will inject that into this Greeting Implementation which is being tested. in the process it will create an instance of this(private GreetingImpl greeting;) for us.we dont want to use new operator create the instance 

@ExtendWith(MockitoExtension.class)
public class GreetingImpleTestJunit5 {
	
	@Mock 
	private GreetingService service;//we need to inject this in grettingimpl so use @InjectMock
	
	@InjectMocks
	private GreetingImple greeting;//when this runner(MockitoExtension.class) run this test runs our test it will look at @InjectMock ann it will immediately create an object or an instance of this greetingImple..so we can remove the code in voidsetup method



	@Test
	public void greetShouldReturnValidOutput() {
		System.out.println("greetShouldReturnValidOutput");
		when(service.greet1("vishal")).thenReturn("Hellovishal");
		String result = greeting.greet1("vishal");
		System.out.println(result);
		Assertions.assertNotNull(result);
		Assertions.assertEquals("Hellovishal", result);
	}
	
	
	@Test
	public void greetShldThrowAnException_ForNameIsNull() {
		System.out.println("greetShldThrowAnException_ForNameIsNull");
		doThrow(IllegalArgumentException.class).when(service).greet1(null);
		//Assertions.assertThrows(expectedType, executable)--->syntax
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			greeting.greet1(null);
		});
		
	}
	
	
	@Test
	public void greetShldThrowAnException_ForNameIsBlank() {
		System.out.println("greetShldThrowAnException_ForNameIsBlank");
		doThrow(IllegalArgumentException.class).when(service).greet1(" ");
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			greeting.greet1("");
		});
		
		
	}
	
	
	


}




