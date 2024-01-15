package ProperMulthiThreadingExample;

class printers{
	void printDocuments(int noOfCopies,String name) {
		for (int i=1;i<=noOfCopies;i++) {
			System.out.println("Document printed  "+name+" " +i);
			
		}
	}
}
class MyThread extends Thread{
	//creating printer reference
	printers pref;
	MyThread (printers p){
		pref=p;
	}
	public void run() {
		pref.printDocuments(100, "Math.pdf");
		
	}
}

class YourThread extends Thread{
	//creating printer reference
	printers pref;
	YourThread (printers p){
		pref=p;
	}
	public void run() {
		pref.printDocuments(100, "Economics.pdf");
		
	}
}





public class App {
	public static void main(String[] args) {
		System.out.println("Application started");
		//we have only one printer object
		printers p=new printers();//the scenario is we have multiple threads working on the same printer object
		MyThread mt=new MyThread(p);//MyThread is having reference to the printer object
		mt.start();
		YourThread yt=new YourThread(p);//YourThread is having reference to the printer object
		yt.start();
		
		
	
		System.out.println("Application ended");
		
		
	}
}
//If multiple threads are working on same object we need to synchronize them
//In real time scenario if we go to printer shop we cannot run 2 jobs that is like printing math n economic pdf simultaneously it will be confusing
//so we need to specify join or synchronized





