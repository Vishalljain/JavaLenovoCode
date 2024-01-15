package com.in28minutes.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.hamcrest.CoreMatchers.is;

public class ListMock {

	@Test
	public void letsMockListSize() {
		List list = mock(List.class);
		Mockito.when(list.size()).thenReturn(10);//when the list.size method is called i want to return 10...i am mocking here list.size method
		assertEquals(10, list.size());
		assertEquals(10, list.size());
	}
	
	@Test
	public void letsMockListSizeWithMultipleReturnValues() {
		List list = mock(List.class);
		Mockito.when(list.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, list.size()); // First Call
		//assertEquals(10, list.size());//java.lang.AssertionError: expected:<10> but was:<20>
		assertEquals(20, list.size()); // Second Call
	}
	
	@Test
	public void letsMockListGet() {
		List<String> list = mock(List.class);
		Mockito.when(list.get(0)).thenReturn("in28Minutes");//am mocking here list.get method.Mockito mocks are nice when u dont tell them what to do they return default..so when an expectation is not set and the method is called it return the default value  
		assertEquals("in28Minutes", list.get(0));
		assertEquals(null, list.get(1));//this is called nice mock it will return a default value
		assertNull(list.get(1));
	}
	
	//i would always want to return in28Minutes irrespective of the parameter that is passed thats where things like argument matcher comes up
	@Test
	public void letsMockListGetWithAny() {
		List<String> list = mock(List.class);
		Mockito.when(list.get(Mockito.anyInt())).thenReturn("in28Minutes");//we have anyObject, anyChar,anyDouble,anyString,anyBoolean
		// If you are using argument matchers, all arguments
		// have to be provided by matchers.
		//assertEquals(expected, actual);
		assertEquals("in28Minutes", list.get(0));
		assertEquals("in28Minutes", list.get(1));
	}
	
	@Test(expected=RuntimeException.class)
	public void letsMockListThrowException() {
		List<String> list = mock(List.class);
		Mockito.when(list.get(Mockito.anyInt())).thenThrow(new RuntimeException("Something"));
		list.get(0);
	}
	@Test
	public void bddAliases_UsingGivenWillReturn() {
		//given --set up
		List<String> list = mock(List.class);
		given(list.get(Mockito.anyInt())).willReturn("in28Minutes");
		
		//when
		String firstElement = list.get(0);
		//then
		assertThat(firstElement,is("28Minutes") );
		
	}
}
