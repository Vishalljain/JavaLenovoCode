/*
 * The Java throw keyword is used to explicitly throw an exception.

We can throw either checked or uncheked exception in java by throw keyword. 
The throw keyword is mainly used to throw custom exception. We will see custom exceptions later.
*/


package ThrowVsThrows;


public class ThrowException {
	int a=10;
	int b=0;
	void divide() {
		if(b==3) {
			throw new ArithmeticException("b is equal to 3");//throwing exception explicitly
		}
		else {
			int c=a/b;
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		ThrowException te=new ThrowException();
		te.divide();
	}
	

}
