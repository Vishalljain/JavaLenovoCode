package com.junit5.Mockito.Service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.junit5.Mockito.dao.TicketDAO;
import com.junit5.Mockito.dto.Ticket;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")
public class TicketServiceImpleTest {
	
	
	@Mock
	TicketDAO dao;
	
	@Autowired
	@InjectMocks
	private TicketService service;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	

	@Test
	public void test() {
		when(dao.create(any(Ticket.class))).thenReturn(1);
		int result = service.buyTicket("vishal", "012345678910");
		assertEquals(1, result); 
		
	}

}
