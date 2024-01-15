package com.junit5.Mockito;

public class GreetingServiceImple implements GreetingService {

	
	public String greet1(String name) {
		if(name==null || name.length()==0) {
			throw new IllegalArgumentException();
		}
		
		return "Hello" + name;
		
	}
}
