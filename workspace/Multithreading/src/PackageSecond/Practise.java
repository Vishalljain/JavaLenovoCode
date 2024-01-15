package PackageSecond;

class Practise1 extends Thread {
	public void run() {
		for(int doc =1;doc<100;doc++) {
			System.out.println("Job 2 The doc no is"+doc);
		}
	}
	

}
public class Practise{
	public static void main(String[] args) {
		System.out.println("Job 1");
		Practise1  p1 = new Practise1();
		p1.start();
		
		System.out.println("Job 3");
		
		for(int doc=1;doc<100;doc++) {
			System.out.println("Job 4 The doc no is"+doc);
			
		}
		System.out.println("Job 5");
		
		
	}
}

