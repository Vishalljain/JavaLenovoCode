/*
 * Prerequisites :- Nested Classes in Java
Anonymous class is an inner class without a name and for which only a single object is created
An anonymous inner class can be useful when making an instance of an object with certain “extras”
 such as overloading methods of a class or interface, without having to actually subclass a class....overriding methods without creating sub class
Anonymous inner class are mainly created in two ways:
1.Class (may be abstract or concrete)
2.Interface
 */

class Machine {
	void start() {
		System.out.println("Machine started");
	}
}

interface Plant {
	void grow();
}

public class App {
	public static void main(String[] args) {
		Machine m = new Machine() {//called annonymous we dont have class name
	
			void start() {
				System.out.println("Camera Started");

			}

		};
		m.start();
		Plant p = new Plant() {

			@Override
			public void grow() {
				System.out.println("Plants are growing successfully:)");

			}

		};
		p.grow();

	}
}

//adavantage:it helps in code optimization
//it logically grp classes and interfaces in one place only
//it can access all the data members and methods of outer classes includng private
