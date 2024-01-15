package otherdatatypesintostring;

public class Str {

public static void main(String[] args) {
	 int int_value=10;
	 double double_value=2.0;
	String s1=String.valueOf(int_value);
	String s2=String.valueOf(double_value);
	System.out.println(int_value);//10
	System.out.println(double_value);//2.0
	//How do we identify it is converted as string 
	System.out.println(s1+10);//it need to be 20 since int_value is 10 but it is converted to string it will be 1010
	System.out.println(s2+21);//2.021
	
	
}
}
