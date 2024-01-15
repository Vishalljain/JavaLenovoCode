package com.training;

public class GreetingImple implements Greeting {

	@Override
	public String greet(String name) {
		if(name==null || name.length()==0) {
			throw new IllegalArgumentException();
		}
		
		return "Hello" + name;
	}

}
