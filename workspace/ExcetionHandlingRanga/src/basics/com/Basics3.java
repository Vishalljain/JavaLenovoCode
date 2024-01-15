package basics.com;
public class Basics3 {
	public static void main(String[] args) {
		method1();
		System.out.println("main");
	}

	private static void method1() {
		method2();
		System.out.println("method1");
	}

	private static void method2() {
		
		String m = null;
		m.length();
		System.out.println("method2");
		
	}

}

/*Exception in thread "main" java.lang.NullPointerException
	at basics.com.Basics3.method2(Basics3.java:13)
	at basics.com.Basics3.method1(Basics3.java:8)
	at basics.com.Basics3.main(Basics3.java:4)
*/

/*no sysout printed anywhere
here method 2 is trying to handle te exception  it does not have any exception handling in here so it sends to method 1 ,,method 1 is like i dont know how to handle this
now it will send to main n main says i dont no how to handle this too...here main is final authority if not able to handle it..it will throw out
note:in the calling method if ur not handling the exception the code after the method call which is causing exception will not exected as well
*/