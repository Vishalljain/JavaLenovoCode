
public class Repeat {
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}

	private static int factorial(int value) {//4,3,2
		if (value==1) {
			return 1;
	}
		return value*factorial(value-1);//12,6,2
		

}
}
