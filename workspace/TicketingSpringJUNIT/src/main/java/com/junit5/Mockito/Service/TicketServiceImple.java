package com.junit5.Mockito.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.junit5.Mockito.dao.TicketDAO;
import com.junit5.Mockito.dto.Ticket;

@Component
public class TicketServiceImple implements TicketService {
	
	@Autowired
	private TicketDAO dao;

	public TicketDAO getDao() {
		return dao;
	}

	public void setDao(TicketDAO dao) {
		this.dao = dao;
	}

	@Override
	public int buyTicket(String passengerName, String phone) {
		Ticket ticket = new Ticket();
		ticket.setPassengerName(passengerName);
		ticket.setPhone(phone);
		int create = dao.create(ticket);
		
		return create;
	}

}
