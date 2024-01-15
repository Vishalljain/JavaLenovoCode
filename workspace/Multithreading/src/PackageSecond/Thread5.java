package PackageSecond;


	class c1{
		
	}

	
	class MyTask4 extends c implements Runnable{

		@Override
		public void run() {
			
				for (int doc = 1; doc <= 100; doc++) {
					System.out.println("The doc no  is :" + doc+" of type 2");// consider as job 2
				}
			}
		}
	class YourTask3 implements Runnable{

		@Override
		public void run() {for (int doc = 1; doc <= 100; doc++) {
			System.out.println("The doc no  is :" + doc+" of type 3");
			
			}
		}
		
		
	}

	public class Thread5  {
		public static void main(String[] args) {
			System.out.println("Line first");
			Runnable r=new MyTask4();
			Thread task=new Thread(r);
			task.start();
			//Thread t =new Thread(new YourTask3());//write in one line or below 2 lines
			Runnable r1=new YourTask3();
			Thread task1 =new Thread(r1);
			task1.start();

			for (int doc = 1; doc <= 100; doc++) {
				System.out.println("The doc no  is :" + doc + " of type 1");
			}
			System.out.println("Last line");

			}
		}
		

