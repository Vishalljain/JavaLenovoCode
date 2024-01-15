

public class StaticInnerClass {
	public static void main(String[] args) {
		
		A1.B obj = new A1.B();
		obj.show();
		
		
	}

}

class A1{
	int roolNo;
	String name;
	
	static class B{
		void show() {
			System.out.println("Hello");
		}
	}

}
