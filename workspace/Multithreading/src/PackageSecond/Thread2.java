package PackageSecond;
class Mytask{
	void myPrint() {
		for (int doc = 1; doc <= 10; doc++) {
			System.out.println("The doc no  is :" + doc+" of type 2");// consider as job 2
		}
	}
	
}




public class Thread2 {
	public static void main(String[] args) {

		System.out.println("Line first");// consider as job 1
		//till job2 is not executed below jobs are waiting until job 2 is exxecuted
		Mytask mt=new Mytask();//now this is job 2
		mt.myPrint();
		
		
		for (int doc = 1; doc <= 10; doc++) {
			System.out.println("The doc no  is :" + doc+" of type 1");// consider as job 3
		}
		System.out.println("Last line");// consider as job 4

	}

}
//i told it will execute in sequential  manner until job 2 is finished job 3 is not started
//consider if job 2 has lakhs of documents then job 3 has to wait until job 2 is completed so will creaate thread in next example