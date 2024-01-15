//Equal method  work for objects not for primitive type like int
public class Equal1 {
	public static void main(String[] args) {
		Integer number1=7;
		Integer number2=7;
		System.out.println(number2.equals(number1));
		//For primitive ==
		int a=5;
		int b=5;
		System.out.println(a==b);
		
	}

}

/*
 * Main difference between .equals() method and == operator is that one is
 * method and other is operator. Equal method work for objects not for primitve
 * type Equals method for content comparision and == is for address comparison
 */
