package basics.com;

import java.sql.SQLException;

public class Basics6 {
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
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		catch (NullPointerException e) {
			e.printStackTrace();System.out.println("variable is null");
			}
		catch (Exception e) {
			e.printStackTrace();System.out.println("variable is null");
			}
		
		
		
		
		
		
		
	
	}

}
