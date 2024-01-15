package com.junit5.Mockito.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorImpleTest {

	@Test
	public void addSholdReturnResult() {
		Calculator calculator = new CalculatorImple();
		int add = calculator.add(10, 90);
		assertEquals(100, add);
		
	}
	@Test                                               
	public void checkNumTest() {
	    int num1 = 20;
	    assertTrue("Number is not equal to 0", num1!=0);
	}
	@Test                                               
	public void checkNullTest() {
	    String num1 = null;
	    assertNull("String is null",num1);
	}
	
	@Test                                               
	public void checkNotNullTest() {
	    String num1 = "vishal";
	    assertNotNull("String is null",num1);
	}
	
	@Test                                               
	   public void checkAssertSameTest() {
	        Object num1 = new Object();
	        Object num2 = new Object();
	        assertSame(num1, num2);
	   }

}
