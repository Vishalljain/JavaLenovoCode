
public class InnerMemeberClass {
	public static void main(String[] args) {
		A a = new A();
		
		a.roolNo=8;
		
		A.B obj = a.new B();
		obj.show();
		
		
	}

}

class A{
	int roolNo;
	String name;
	
	class B{
		void show() {
			System.out.println("Hello");
		}
	}
}
