package com.util;

public final class IdGenerator {//i want evrybody to use same  IdGenerator class and i dont want anyone to extend this class and come up with their implementation n override it so making as final

	
	static int i;
	
	public static final int genetateId() {
		return i++;
	}
}
