package com.junit5.Mockito.dao;

import org.springframework.stereotype.Component;

import com.junit5.Mockito.dto.Ticket;

@Component
public class TicketDAOImple implements TicketDAO {

	@Override
	public int create(Ticket ticket) {
		
		return 1;
	}

}
