//Thread is a light  weight sub process
//it is a smallest independent part of the program
//each thread contains separate path of execution
//every java prgms contains atleast one thread ...main method contain main thread.
//A thread can be created in 2 ways by using thread class and by using runnable interface
//thread class:
/*1)create a thread class
 * 2)override run method()
 * 3)create obj of the class
 * 4)invoke start method to execute the  run method()
 * */



public class ThreadClass extends Thread{
	public void run() {
		System.out.println("Edureka");
	}
	public static void main(String[] args) {
	ThreadClass th= new ThreadClass();
	th.start();
	
	}
	

}

//From google
/*
 * Threads can be created by using two mechanisms :
1. Extending the Thread class
2. Implementing the Runnable Interface

 
Thread creation by extending the Thread class

We create a class that extends the java.lang.Thread class. 
This class overrides the run() method available in the Thread class.
 A thread begins its life inside run() method.
  We create an object of our new class and call start() method to start the execution of a thread. 
  Start() invokes the run() method on the Thread object.
 */