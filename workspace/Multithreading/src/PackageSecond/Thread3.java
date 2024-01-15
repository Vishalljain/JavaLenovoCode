package PackageSecond;

class Mytask1 extends Thread {
	public void run() {
		for (int doc = 1; doc <= 100; doc++) {
			System.out.println("The doc no  is :" + doc + " of type 2");// consider as job 2
		}
	}
}

public class Thread3 {
	public static void main(String[] args) {
		System.out.println("Line first");
		Mytask1 mt = new Mytask1();//child thread or worker thead
		mt.start();

		for (int doc = 1; doc <= 100; doc++) {
			System.out.println("The doc no  is :" + doc + " of type 1");
		}
		System.out.println("Last line");

	}

}

//here main and MyTask are executing parallely
//here output is mixed keeps on changing
//next example using runnable interface