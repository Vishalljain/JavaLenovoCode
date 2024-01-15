  // Creating a copy of object in a different memory location. This is called a Deep copy.
public class DeepCopy {
	
	public static void main(String[] args) {
		Apple apple1=new Apple();//obj 1 so address 100
		apple1.a=10;
		apple1.b=20;
		
		Apple apple2=new Apple();// obj 2 so address 101
		apple2.a=apple1.a;
		apple2.b=apple1.b;
		apple2.b=100;
		System.out.println(apple1);//10,20
		System.out.println(apple2);//10,100
		//differnt output refering to diifernt obj 
		//but if there are 50 variables in apple1 then it is lenghty process
		
	}

	
}
class Apple{
	int a;
	int b;
	@Override
//	public String toString() {
//		return "Apple [a=" + a + ", b=" + b + "]";
//	}
	public String toString() {
		return a+"  "+b;
	}
	
}
