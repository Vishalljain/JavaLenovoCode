/*//Final is a special keyword in java that is used as a non access modifier.
When a variable is declared as final then the value of the varaible cannot be changed. In case if no value is assigned to the final
variable using only the class constructor a value can be assigned to it*/
 class FinalVariable {
	final int speed =10;
	void run() {
	//speed =500;//if i use this line output compile time error
		System.out.println(speed);
	}
	
public static void main(String[] args) {
	FinalVariable fv = new FinalVariable();
	fv.run();
	//For local variable 
	final int i;
	i=20;
	//i=30;
	System.out.println(i);
}
}
