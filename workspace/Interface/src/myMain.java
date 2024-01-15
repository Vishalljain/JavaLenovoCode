//interfaces are similar to abstract  class but it contain all the abstarct methods
//using interfaces we can achieve 100 percent abstraction
//interfaces are blueprint of classes it specify what to do not how 
//multiple inHERITANCE is possible using interfaces
//we cannot create concrete methods but using default keyword we can create concrete methods
//An interface cannot contain a constructor (as it cannot be used to create objects)

interface Animal{
	public void Tiger();//complier by default take it as abstract void Tiger()
	abstract public  void Lion();
	 default void display(){//concrete method using default keyword
		System.out.println("save animals");
		
	}
	
}

class nationalAnimal implements Animal{//when we inherit we need to implement all abstarct methods

	@Override
	public void Tiger() {
		System.out.println("Tiger is a national animal");
		
	}

	@Override
	public void Lion() {
		System.out.println("Lion is not a national animal");
		
	}
	
}

public class myMain{
	public static void main(String[] args) {
		//we cannot create object for interface for ex anaimal class
		nationalAnimal na=new nationalAnimal();
		na.Tiger();
		na.Lion();
		na.display();
	}
	
}
