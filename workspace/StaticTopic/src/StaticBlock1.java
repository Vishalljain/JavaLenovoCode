//static blocks are used to initializes the static data members and static block is executed once
public class StaticBlock1 {
	static String s;
	static {
		s="Vishal";
		System.out.println(" Hi " +s);
	}
public StaticBlock1() {
	System.out.println("This is Cts");
}
public static void main(String[] args) {//static block is executed once and constructor 3 times
	StaticBlock1 s1=new StaticBlock1();
	StaticBlock1 s2=new StaticBlock1();
	StaticBlock1 s3=new StaticBlock1();
	
}

}
