package PackageSecond;

public class Thread1 {//main method represent main thread
	public static void main(String[] args) {
		//whatever we write in main method IT WILL BE EXECUTED BY MAIN METHOD
		//Threads always execute jobs in a sequential manner
		System.out.println("Line first");//consider as job 1
		for (int doc =1;doc<=10;doc++) {
		System.out.println("The doc no is :"+doc);//consider as job 2
		}
		System.out.println("Last line");//consider as job 3 
		//here job 1,job 2 n job 3 is executed in sequential mannner first job 1 then job 2 then job 3
	}

}
