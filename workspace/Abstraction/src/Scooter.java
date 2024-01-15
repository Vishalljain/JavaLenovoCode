
//A method without body(no implementation) is known as abstraction
//If there is atleast one abstract method then the class should be abstarct..but a class can be abstarct with or without abstarct method
//If a class extends abstract class then it has to implement all abstarct methods of the parent class
//.for ex here abstract start method we need to write that method in car n scotter(we are overriding the start method)
//Abstract class cannot be instantiated means we cannot create objects because here abstarct void method dont have implementation 
//then what is the use.
//abstraction can be achieved by abstract method n interface
//using abstract method we cannot achieve 0 to 100 percent  abstraction because we may have concrete methods
//using interface we can achieve 100 percent abstraction

//The main purpose of abstarction is to hide the unnessary details from the users
//Suppose you want to create a banking application and you are asked to gather the info about a customer.
//There are chances you may come up with
//Full name,address, contact no n fav food
//But all above info is not required to create bank app  only few fav food is not required.

abstract class vehicle{
	abstract  void start() ;//--->method without body
		
	}
class car extends vehicle{

	@Override//
	void  start() {
		System.out.println("Car start by key");
		}
	
	
}

public class Scooter extends vehicle {
	
	@Override
	void start() {
		System.out.println("Scooter starts by a kick");
		
	}
	public static void main(String[] args) {
	vehicle c =new car();
	c.start();
	Scooter s=new Scooter();
	s.start();
	

	}


}
