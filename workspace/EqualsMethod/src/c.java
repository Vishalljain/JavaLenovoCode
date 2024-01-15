
public class c {
	public static void main(String[] args) {
		int a =10;
		Integer b = 10;
		Integer c =10;
		System.out.println(a==b);//true
		System.out.println(b==c);//true
		System.out.println(b.equals(c));//true
		//System.out.println(a.equals(b));
		int myInt1 = 10; 
		Integer myInteger1 = 10; 
		Integer myInteger2 = 10; 
		Integer myInteger3 = new Integer(10); 
		Short myShort1 = 10; 
		
		 
		System.out.println(myInt1 == myInteger1); //true
		System.out.println(myInt1 == myInteger3); //true
		System.out.println(myInt1 == myShort1); //true
		 
		 
		System.out.println(myInteger1 == myInteger2);//true 
		System.out.println(myInteger1 == myInteger3);//false
		
		
		Integer r = new Integer(10);
		Integer s = new Integer(10);
		System.out.println(r == s);//false
 
		 
		//System.out.println(myShort1 == 10.0); 
	}

}
