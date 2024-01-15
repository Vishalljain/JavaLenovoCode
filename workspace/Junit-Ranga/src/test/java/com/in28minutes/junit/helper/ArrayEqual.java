package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;

import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

public class ArrayEqual {

	@Test
	public void test1() {
		int[] number = {10,1,3,4,5};
		int[] expected = {1,3,4,5,10};
		Arrays.sort(number);
		//assertEquals(expected, number);//error->java.lang.AssertionError: expected:<[I@22d8cfe0> but was:<[I@579bb367>....>assertEqual check for object not for values
		assertArrayEquals(expected, number);//assertArrayEquals check for values
	}
	
	@Test
	public void testException2(){//fails
		int[] number = null;
		Arrays.sort(number);
		
	}
	
	@Test
	public void testException3(){//TRUE
		int[] number = null;
		try {
		Arrays.sort(number);
		}catch (NullPointerException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
//		catch (IndexOutOfBoundsException e) {//Unreachable catch block for IndexOutOfBoundsException. It is already handled by the catch block for Exception
//			
//		}
		
		
	}
	@Test(expected=NullPointerException.class)
	public void testException4(){//fails
		int[] number = null;
		Arrays.sort(number);
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testException5(){//fails
		int[] number = {};
		Arrays.sort(number);
		
	}
	//performance testing in junit
	@Test(timeout=10)//i want to execute this test case within 10 sec if more false n throw TimeoutException
	public void test6() {
		int array[] = {2,1,3,4,5,7,6,8,9,10,0};
		for(int i =0; i<=100000;i++) {
			array[0]=i;
			Arrays.sort(array);
			
		}
		
		
	}
	

}
