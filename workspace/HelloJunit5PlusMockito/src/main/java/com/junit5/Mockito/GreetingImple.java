package com.junit5.Mockito;

public class GreetingImple implements Greeting {

	private GreetingService service;
	
	public String greet1(String name) {
		return service.greet1(name);
	}
		

	
	
	

}
