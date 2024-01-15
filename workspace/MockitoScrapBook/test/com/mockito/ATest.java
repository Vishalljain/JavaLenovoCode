package com.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ATest {

	@Mock
	B b;
	private  A a;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);//scan the class so at runtime all our mocks(B b) are scanned and initialized.
		a=new A(b);
	}
	
	@Test
	public void usesvoidmethodshldcallvoidmethod() throws Exception {
		a.usesvoidmethodofclassb();//we dont want to add when class explicitly 
		verify(b).voidmethod();
		assertSame(1, a.usesvoidmethodofclassb());
		
	}
	
	//in prevoius method we have seen that simply stubbing out the class(B b) will stubout all the void methods that is stub void method interanlly
	
	
	//We will see how explicitly stub out void method
	

	@Test
	public void usesvoidmethodshldcallvoidmethod1() throws Exception {
		
		doNothing().when(b).voidmethod();
		a.usesvoidmethodofclassb();
		verify(b).voidmethod();
	
	}
	
	@Test(expected=RuntimeException.class)
	public void usesvoidmethodshldthrowRunTimeException() throws Exception {
		doThrow(Exception.class).when(b).voidmethod();
		a.usesvoidmethodofclassb();
		verify(b).voidmethod();
	}
	
	//Use DoNothing  to do consecutive calls..if void method is called more than one time u can tell mockito what shld be done for time what shld be done for 2 time n so on
	//that is where do nothing method is very useful by default u dont want to stubout the void methods for the non exceptional scenarios  

	@Test(expected=RuntimeException.class)
	public void testConsecutiveCall() throws Exception {
		doNothing().doThrow(Exception.class).when(b).voidmethod();//this syntax simply tell mockito that when void method on B is called first time
		//it shld do nothing and when it is called 2nd time it will throw an exception 
		a.usesvoidmethodofclassb();//run upto this line test is failed as we are telling do nothing n expected result we did not got the error is Expected exception: java.lang.RuntimeException 
		verify(b).voidmethod();
		a.usesvoidmethodofclassb();//this line will change fail to success
		
	}


}
