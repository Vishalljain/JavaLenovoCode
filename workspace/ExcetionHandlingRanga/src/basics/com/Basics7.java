package basics.com;
public class Basics7 {
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
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[5]);
		System.out.println("method2");
		}catch (NullPointerException e) {
			System.out.println("variable is null");
			e.printStackTrace();
			}
//		catch (Exception e) {
//			e.printStackTrace();//if these exception is commented code will not execute method1 n main
//			}
	}

}
