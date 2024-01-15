
public class NarrowCasting {

	public static void main(String[] args) {
		double myDouble = 9.57;
		int myInt = (int) myDouble;
		int myInt1 = (int) 9.57;
		System.out.println(myDouble);//9.57
		System.out.println(myInt);//9
		System.out.println(myInt1);//9
		
		//
		
		
		int intvalue=888;
		long longvalue=9999;
		double doublevalue=99.90;
		intvalue=(int)longvalue;
		System.out.println(intvalue);//9999
		doublevalue=intvalue;
		System.out.println(doublevalue);//9999.0

	}

}
