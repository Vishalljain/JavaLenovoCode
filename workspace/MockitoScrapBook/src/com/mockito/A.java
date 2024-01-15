package com.mockito; 

public class A {
	private B b;
	

	public A(B b) {
		this.b = b;
	}


	public int usesvoidmethodofclassb() {
		try {
			b.voidmethod();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return 1;
		
	}

}
