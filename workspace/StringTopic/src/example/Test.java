package example;



public class Test {
	  public static void main(String[] args) {

	    String str1 = new String("Know Program");
	    String str2 = new String("Know Program");
	    System.out.println(str1.equals(str2));//true
	    
	    StringBuilder sb1 = new StringBuilder("Know Program");
	    StringBuilder sb2 = new StringBuilder("Know Program");
	    System.out.println(sb1.equals(sb2));//false
	  }
	}
