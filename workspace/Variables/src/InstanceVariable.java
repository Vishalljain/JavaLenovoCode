//Instance variables are declared within the class but not inside method
//ex:classTest{
//int a=20;-->Instance Variable
//flaost pi=3.14-->Instance Variable
//}
//Instance variable always get a default value that is zero.
//cannot be renitialized within the class but reinitialized within a method
//ex->class Test{                                            class Test{
//int data=30;												 int data=30;
//data=40;->cannot be renitialized within the class			 void someMethod{
//}															 data=50;-->but reinitialized within a method
//															}
public class InstanceVariable {
	int c;//Instance Variable define inside class and used outside in the method
	public void addition() {
		int a=90;
		int b=10;
		c=a+b;//if i put int for c that is int c it could have become local Variable
		System.out.println("addition is:"+c);
	}
	public void subtraction() {
		int a=90;
		int b=10;
		c=a-b;// used outside in the method
		System.out.println("subtraction is:"+c);
	}
	public static void main(String[] args) {
		InstanceVariable iv=new InstanceVariable();
		iv.addition();
		iv.subtraction();
	}

}
