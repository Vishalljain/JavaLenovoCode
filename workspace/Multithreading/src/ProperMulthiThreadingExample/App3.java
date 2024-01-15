// synchronize lock a particular method until it get complete no other process can start
//synchronize is used when multiple threads are working on same object


package ProperMulthiThreadingExample;
class printers2{
	synchronized void printDocuments(int noOfCopies,String name) throws InterruptedException {
		for (int i=1;i<=noOfCopies;i++) {
			Thread.sleep(500);
			System.out.println("Document printed  "+name+" " +i);
			
		}
	}
}
class MyThread2 extends Thread{
	
	printers2 pref;
	MyThread2 (printers2 p){
		pref=p;
	}
	public void run() {
		
			//This will apply a lock until this method is run no method can run
				try {
					pref.printDocuments(100, "Math.pdf");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		
	}


class YourThread2 extends Thread{
	//creating printer reference
	printers2 pref;
	YourThread2 (printers2 p){
		pref=p;
	}
	public void run() {
		try {
			pref.printDocuments(100, "Economics.pdf");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}





public class App3 {
	public static void main(String[] args) {
		System.out.println("Application started");
	
		printers2 p=new printers2();
		MyThread2 mt=new MyThread2(p);
		mt.start();
		YourThread2 yt=new YourThread2(p);
		
		yt.start();
		
		
	
		System.out.println("Application ended");
		
		
	}

}

