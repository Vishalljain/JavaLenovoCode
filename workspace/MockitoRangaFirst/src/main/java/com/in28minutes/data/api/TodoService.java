package com.in28minutes.data.api;

import java.util.List;


public interface TodoService {
	public List<String> retrieveTodos(String user);
	
	//For Verify
	public void deleteToDo(String toDo);
}

//A stub is nothing but the sample implementation or dummy implementation of the ToDoService