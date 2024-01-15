package com.order.bo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import com.order.bo.exception.BOException;
import com.order.dao.OrderDAO;
import com.order.dto.Order;

public class OrderBOImplTest {
	
	@Mock
	OrderDAO dao;
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);//at run time ur passing this (i.e OrderBOImplTest) testcases object refernces to this MMockitoAnnotations so that it will scan through all the objects and any object that is mark with @Mock will be knocked out it will create a proxy mock of the orderdao
	}

	@Test
	public void placeOrderShouldCreateanorder() throws SQLException, BOException {
		OrderBOImpl bo = new OrderBOImpl();
		bo.setDao(dao);
		//when -->is very important method which allow us to mockout the method call so we want to mockout the create method of the orderDAO  becuase that is the method which is internally called by the place order method we want this create method to do what we ask it to do.
		
		Order order = new Order();
		when(dao.create(order)).thenReturn(new Integer(1));//value shld be one because one is successful and zero is failure for us
		//so we have mocked out the dao and we have set the expectations by using when ...when is like a trigger and we use the 'thenReturn'method to return the result which we want
		boolean result = bo.placeOrder(order);
		assertTrue(result);
		
		//now lets verify that our mocked out method is really getting called let use the verify method available  
		verify(dao).create(order); 
	
	}



//quiz-which annotation can be used to mock the object--->@Mock
//which method in the mockito api shld be called to initialize the mocks?-->initMocks
//which static method can be stub out the method calls on the mock object-->when
//while using the when method to stub which method shld be used to return a value--->thenReturn
//which methods in the junit api can be used to verify the results

/*
 
@Mock
	OrderDAO dao;//First Stubbed out the class or dependency
	when(dao.create(order)).thenReturn(new Integer(1))---> we have set up the expectations
	assertTrue(result);verify(dao).create(order); ------>we have verify the results 
 
 */
//negative scebario
@Test
public void placeOrderShouldNotCreateanorder() throws SQLException, BOException {
	OrderBOImpl bo = new OrderBOImpl();
	bo.setDao(dao);
	Order order = new Order();
	when(dao.create(order)).thenReturn(new Integer(0));	//shld return false for 0 n 1 for true
	boolean result = bo.placeOrder(order);
	assertFalse(result);  
	verify(dao).create(order); 

}


//for exception scenario The sql exception thrown from dao layer shld be wrapped inside a bo exception as per the code so the expectation is to recive the   bo exception 


@Test(expected=BOException.class)
public void placeOrderShouldThrowBOException() throws SQLException, BOException {
	OrderBOImpl bo = new OrderBOImpl();
	bo.setDao(dao);
	Order order = new Order();
	when(dao.create(order)).thenThrow(SQLException.class);
	//when(dao.create(any(Order.class))).thenThrow(SQLException.class);//matcher method
	boolean result = bo.placeOrder(order);
	

}

@Test
public void cancelOrder_should_cancelTheorder() throws SQLException, BOException {
	Order order = new Order();
	when(dao.read(123)).thenReturn(order);	
	//when(dao.read(anyInt())).thenReturn(order);	
	when(dao.update(order)).thenReturn(new Integer(1));
	OrderBOImpl bo = new OrderBOImpl();
	bo.setDao(dao);
	boolean result = bo.cancelOrder(123);
	assertTrue(result);
	verify(dao).read(123);
	verify(dao).update(order);
	
}

@Test
public void cancelOrder_shouldnot_cancelTheorder() throws SQLException, BOException {
	Order order = new Order();
	when(dao.read(123)).thenReturn(order);	
	when(dao.update(order)).thenReturn(new Integer(0));
	OrderBOImpl bo = new OrderBOImpl();
	bo.setDao(dao);
	boolean result = bo.cancelOrder(123);
	assertFalse(result);
	verify(dao).read(123);
	verify(dao).update(order);
	
}


@Test(expected=BOException.class)
public void cancelOrderShouldThrowBOExceptionOnRead() throws SQLException, BOException {
	Order order = new Order();
	when(dao.read(123)).thenThrow(SQLException.class);	
	OrderBOImpl bo = new OrderBOImpl();
	bo.setDao(dao);
    bo.cancelOrder(123);
	
	
}

//cancel order exception on update

@Test(expected=BOException.class)
public void cancelOrderShouldThrowBOExceptionOnUpdate() throws SQLException, BOException {
	Order order = new Order();
	when(dao.read(123)).thenReturn(order);	
	when(dao.update(order)).thenThrow(SQLException.class);	
	OrderBOImpl bo = new OrderBOImpl();
	bo.setDao(dao);
	bo.cancelOrder(123);
	
	
}

//for code refactor put below 2 lines in setup method and delete from all methods
//OrderBOImpl bo = new OrderBOImpl();
//bo.setDao(dao);


@Test
public void deleteOrder() throws SQLException, BOException {
	OrderBOImpl bo = new OrderBOImpl();
	bo.setDao(dao);
	when(dao.delete(123)).thenReturn(new Integer(1));
	boolean deleteOrder = bo.deleteOrder(123);
	assertTrue(deleteOrder);
	verify(dao).delete(123);
}

}
