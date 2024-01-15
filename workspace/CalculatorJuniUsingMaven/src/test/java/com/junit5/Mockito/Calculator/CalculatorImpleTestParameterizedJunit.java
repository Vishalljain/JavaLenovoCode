package com.junit5.Mockito.Calculator;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class CalculatorImpleTestParameterizedJunit {
	
	
	//in the imple class we take 2 input n return int as result
	private int a;
	private int b;
	private int expectedResult;
	
	public CalculatorImpleTestParameterizedJunit(int a, int b, int expectedResult) {
		this.a = a;
		this.b = b;
		this.expectedResult = expectedResult;
	}


	//the juinit want this static method shld return the collection of whatever data set we want ..in our case it is the collection of integer arrays
	
	@Parameters
	public static Collection<Integer[]> data(){
		Integer[][] integers = new Integer[][]{{1,1,2},{-1,2,1},{6,7,13}};
		return Arrays.asList(integers);//{-1,2,2} here in first data set -1 = a , 2 = b, 2 =result will be passed at run time 
		
	}
	

	@Test
	public void addSholdReturnResult() {
		Calculator calculator = new CalculatorImple();
		int add = calculator.add(a, b);
		assertEquals(expectedResult, add);
		
	}

}
