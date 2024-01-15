package com.dao;

import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Any;
import org.powermock.core.classloader.annotations.PrepareForTest;





import org.powermock.modules.junit4.PowerMockRunner;

import com.dto.User;
import com.util.IdGenerator;

@RunWith(PowerMockRunner.class)
@PrepareForTest(IdGenerator.class)//we pass the classes that we want to mock at run time.

public class UserDaoTest {

	
	//WE WILL WRITE UNIT TEST FOR CREATE METHOD IN THE USER DAO CLASS BY MOCKING OUT THE ID GENERATORS GENERATED ID STATIC METHOD 
	@Test
	public void createShoudReturnAUserId() {
		UserDao dao = new UserDao();
		mockStatic(IdGenerator.class);//mock the static method on the id generator
		when(IdGenerator.genetateId()).thenReturn(1);
		int result = dao.create(new User());
		assertEquals(1, result);
		verifyStatic();
		
		
	}//due to some jar issue it is not running it need to run success

}
