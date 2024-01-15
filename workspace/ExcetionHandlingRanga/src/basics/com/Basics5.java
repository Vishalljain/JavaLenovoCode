package basics.com;
public class Basics5 {
	public static void main(String[] args) {
		method1();
		System.out.println("main");
	}

	private static void method1() {
		method2();
		System.out.println("method1");//the exception will not be visible to calling method
	}

	private static void method2() {
		try {
		String m = null;//any of code which throws exception it would be caught  and it would be handle in catch block and because we are not throwing the exception out again what would happen is the exception will be hidden fro the other methods..so method2 causing the exception n method 2 handled it.so method1 would not know about the exception at all.
		m.length();
		System.out.println("method2");
		}catch (Exception e) {
			e.printStackTrace();//it will stack see basics4.java we have not used this line
		}
	}
//in this specific sceanrio what we are doing is we are not sending the fact that exception has happened to a method1 

}
