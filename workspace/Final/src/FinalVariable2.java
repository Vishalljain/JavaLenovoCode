//Can we initialize final blank value--yes but only in constructor
public class FinalVariable2 {
final int speed;
public FinalVariable2() {
	// TODO Auto-generated constructor stub
	speed = 500;
	System.out.println(speed);
}
public static void main(String[] args) {
	FinalVariable2 fv2 = new FinalVariable2();//constructor no object creation
	
}
}
//Can we decalre a  constructor as final?
// no because constructor cannot be inherited