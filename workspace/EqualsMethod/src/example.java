
public class example {
public static void main(String[] args) {
	String s1 = "Heelo";
	String s5="Hee"+"lo";
	String s2 ="Heelo";
	String s3 = new String("Heelo");
	System.out.println(s1==s5);//true
	System.out.println(s1==s2);//true
	System.out.println(s1==s3);//false
	System.out.println(s1.equals(s2));//true
	System.out.println(s5.equals(s3));//true
	
}
}
