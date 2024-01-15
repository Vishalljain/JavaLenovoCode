package PackageSecond;


class c{
	
}

//class Myclass extends  c,Thread4-->not possible in java multiple inheritance is not supported
class MyTask3 extends c implements Runnable{

	@Override
	public void run() {
		
			for (int doc = 1; doc <= 100; doc++) {
				System.out.println("The doc no  is :" + doc+" of type 2");// consider as job 2
			}
		}
	}
	



public class Thread4  {
	public static void main(String[] args) {
		System.out.println("Line first");
		MyTask3 r=new MyTask3();
		Thread task=new Thread(r);
		task.start();

		for (int doc = 1; doc <= 100; doc++) {
			System.out.println("The doc no  is :" + doc + " of type 1");
		}
		System.out.println("Last line");

	}
	}
	


