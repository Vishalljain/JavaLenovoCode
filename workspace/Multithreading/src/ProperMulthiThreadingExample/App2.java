
//join method is used to get the output in sequential
//time slice is used to see the output slowly
//join is used when multiple threads are working on same object

package ProperMulthiThreadingExample;
	class printers1{
		void printDocuments(int noOfCopies,String name) throws InterruptedException {
			for (int i=1;i<=noOfCopies;i++) {
				Thread.sleep(500);
				System.out.println("Document printed  "+name+" " +i);
				
			}
		}
 	}
	class MyThread1 extends Thread{
		
		printers1 pref;
		MyThread1 (printers1 p){
			pref=p;
		}
		public void run() {
			try {
				pref.printDocuments(100, "Math.pdf");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	class YourThread1 extends Thread{
		//creating printer reference
		printers1 pref;
		YourThread1 (printers1 p){
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





	public class App2 {
		public static void main(String[] args) {
			System.out.println("Application started");
		
			printers1 p=new printers1();
			MyThread1 mt=new MyThread1(p);
			YourThread1 yt=new YourThread1(p);
			mt.start();
			try {
				mt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			yt.start();
			
			
		
			System.out.println("Application ended");
			
			
		}

	}
//here until math pdf is printed ...economic printed is not started

