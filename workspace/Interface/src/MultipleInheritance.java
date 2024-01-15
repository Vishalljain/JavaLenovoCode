//Multiple Inheritance is a feature of object oriented concept, where a class can inherit properties of more than one parent class.
interface firstInterface {
	void myFirstInterface();
}

interface secondInterface {
//void mySecondInterface();
	void myFirstInterface();
}

class Vishal implements firstInterface, secondInterface {

	@Override
	public void myFirstInterface() {
		System.out.println("Hi this is vishal.L");

	}

//	@Override
//	public   void mySecondInterface(){
//		System.out.println("Working in cognizant technology solutions");
//
//	}

}

public class MultipleInheritance {
	public static void main(String[] args) {
		Vishal vishu = new Vishal();
		vishu.myFirstInterface();
		//vishu.mySecondInterface();
	}

}
