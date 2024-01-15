package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperTestParametrized {
	StringHelper sh = new StringHelper();
	
	private String input;
	private String output;
	
	
	
	public StringHelperTestParametrized(String input, String output) {
		super();
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Collection<String[]> testConditions(){
		String[][] expectedOutput = {{"AACD","CD"},{"AA",""}};
		return Arrays.asList(expectedOutput);
		
	}

	@Test
	public void testtruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals(output, sh.truncateAInFirst2Positions(input));

	}

	
	/*
	 Why define constructor in ParameterizedTest?
For each test method, by default, Junit will create an instance of the test class. 
Hence a constructor is required to pass the defined input/output parameters to the created instance and then used by the test method.
	 */
	

}
