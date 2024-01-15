//When a method is written as final it cannot be overriden by the inherting class

	class Bike{
		final void run() {
			System.out.println("Bike is running");
		}
		
	}
	class FinalMethod extends Bike{//Qes:Is final method iherited ans is yes --Final method is inherited but you cannot overide it
		/*
		 * void run() {//Cannot overide the final method from Bike
		 * System.out.println("car is running"); }
		 */
		public static void main(String[] args) {
			FinalMethod car = new FinalMethod();
			car.run();
			
			 
	}
		
	}
	
	


