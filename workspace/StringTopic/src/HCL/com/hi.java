package HCL.com;

public class hi  {
	public static void main(String[] args) throws InvalidAgeException {
		age(5);
	}

	public static void age(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Below 18 Age");
		}
		else {
		System.out.println("Above age");
		}
		
		
	}

}

class InvalidAgeException extends Exception{

	public InvalidAgeException(String string) {
		// TODO Auto-generated constructor stub
		System.out.println(string);
	}
	
}
