package basics.com;
public class Basics2 {
	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		String m = null;
		m.length();
	}

}

//Exception in thread "main" java.lang.NullPointerException
//at basics.com.Basics2.method1(Basics2.java:9)
//at basics.com.Basics2.main(Basics2.java:4)
//error says in main i was trying to execute line number 4 in  method1 the null pointer exception was thrown by line 9
//this is stack trace got ffrom console