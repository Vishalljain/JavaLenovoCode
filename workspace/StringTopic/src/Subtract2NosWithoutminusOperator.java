
public class Subtract2NosWithoutminusOperator {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int sub;
		sub=a+(~b+1);
		System.out.println(sub);
	}
	

}
//obtain 1's compliment that is ~b 
//then add 1 for 2 compliment that is (~b+1)