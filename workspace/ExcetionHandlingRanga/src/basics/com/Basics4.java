package basics.com;
public class Basics4 {
	public static void main(String[] args) {
		method1();
		System.out.println("main");
	}

	private static void method1() {
		method2();
		System.out.println("method1");
	}

	private static void method2() {
		try {
		String m = null;
		m.length();
		System.out.println("method2");
		}catch (Exception e) {
			
		}
	}

}

//the exception is handled in method 2 so method 1 n main can exceute