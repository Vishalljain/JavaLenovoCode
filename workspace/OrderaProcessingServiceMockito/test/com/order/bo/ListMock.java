package com.order.bo;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class ListMock {
	//For Partial injection we use spy and do return method to stubout
	
	@Spy
	List<String> myList = new ArrayList();
	
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);//at run time ur passing this (i.e OrderBOImplTest) testcases object refernces to this MMockitoAnnotations so that it will scan through all the objects and any object that is mark with @Mock will be knocked out it will create a proxy mock of the orderdao
	}


	@Test
	public void test() {
		
		
		//to stubout method in a spy we cannot use when directly 
		Mockito.doReturn(3).when(myList).size();//we have used doreturn to mockout one of the method in the list that is size method  and we are calling mylist.add it is calling original add method of the list 
		//the above line is read as return 3 when mylist.size method is called
		assertSame(3, myList.size());
	}
	
	@Test
	public void WhyWeCannotUseWhenWithSpy() {
		Mockito.when(myList.get(0)).thenReturn("Romeo");//out of box exception becuase here myList.get(0) is acually calling the real method of List as it is partial mocking ---change  spy to @Mock it will return true
	}

}
