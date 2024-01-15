package com.dao;

import com.dto.User;
import com.util.IdGenerator;

public class UserDao {
	
	public int create(User user) {
		int id = IdGenerator.genetateId();
		
		//save the user object in db but we are not doing all these 
		
		return id;
		
	}

}
