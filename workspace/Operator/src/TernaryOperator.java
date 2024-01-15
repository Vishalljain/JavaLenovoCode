//Syntax:variable x=(expression) ? value if true: value if false
public class TernaryOperator {
	public static void main(String[] args) {
		int a=10;
		int b;
		b=(a==1)? 20:30;
		System.out.println(b);//30
		
		b=(a==10)?50:60;
		System.out.println(b);//50
	}

}
