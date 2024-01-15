//call by value means calling a method with a parameter as value.Through this the argument value is passed to the parameter.
//call by refernce means calling a method with parameter as a reference.Through this argument refernce is passed to the parameter
public class CBv {
	
		int x =10;//instance var  n primitive var always store in stack //so int x=10 in stack
		 public  void modify(int x) {
			 x=x+100;
			 System.out.println(x);
			 
		 }
		 
		 public static void main(String[] args) {
			 CBv cbv = new CBv();
			 System.out.println("before change"+cbv.x);
			 cbv.modify(100);
			 System.out.println("after change"+cbv.x);// it will not change value of x it will be 10
	}

}
