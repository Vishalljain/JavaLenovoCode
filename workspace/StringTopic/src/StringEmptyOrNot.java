
public class StringEmptyOrNot {
public static void main(String[] args) {
	String x=" ";//not empty becuase white space is also as counted as 1 length.
	String y="";//empty
	String z=null;//NullPointexception
	String xyz="Vishal";//not empty
	 int a=xyz.length();
	 if(a==0) {
		 System.out.println("Empty");
	 }
	 else {
		 System.out.println("Not Empty");
	 }
}
}
