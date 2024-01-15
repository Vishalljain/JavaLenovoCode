package com.junit5;

public class GreetingImple implements Greeting {
	@Override
	public String greet1(String name) {
		if(name==null || name.length()==0) {
			throw new IllegalArgumentException();
		}
		
		return "Hello" + name;
	}

}
