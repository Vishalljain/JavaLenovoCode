//swapping strings means we dont swap strings we swap references that is  x and y and not abc n tech strings
public class Swapping2Strings {
	public static void main(String[] args) {
		String x="ABC";
		String y="Tech";
		String temp="";
		System.out.println("Before Swapping x is :"+x);
		System.out.println("Before Swapping y is :"+y);
		temp=x;//it is not read as temp equal to x but it is read as let temp point to the same place where x is pointing
		x=y;//it is not read as x equal to y but it is read as let x point to the same place where y is pointing
		y=temp;//it is not read as y equal to temp  but it is read as let y point to the same place where temp is pointing
		System.out.println("After Swapping x is :"+x);
		System.out.println("After Swapping y is :"+y);
		
	}

}
