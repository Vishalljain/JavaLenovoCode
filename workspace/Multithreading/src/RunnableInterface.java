//if u are extending a class  like class a extend b  extend Thread then u cant use  like multiple inheritance is not supported by java 
//so we use runnable interface
/*
create a thread class implementing runnable interface
override run method
create object of the class
invoke start method using the object
public class ThreadExample implements Runnable{

*/
public class RunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Edureka");
		}
		public static void main(String[] args) {
			RunnableInterface RN = new RunnableInterface();
			Thread t =new Thread(RN);
			
		//Thread t =new Thread(new RunnableInterface());
		t.start();
				
		 
	}
	

}

//From google
/*
Thread creation by implementing the Runnable Interface
We create a new class which implements java.lang.Runnable interface and override run() method. 
Then we instantiate a Thread object and call start() method on this object.*/

/*
 Thread Class vs Runnable Interface
1. If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. 
But, if we implement the Runnable interface, our class can still extend other base classes.
 */