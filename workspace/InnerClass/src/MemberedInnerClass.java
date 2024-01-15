/*
Inner class means one class which is a member of another class.
There are 3 ways to craete inner class in java 
memeber inner class:To access the inner class, create an object of the outer class, and then create an object of the inner class:
static inner class
annonymous inner class
*/





class outer{
	int a;
	void show() {
		System.out.println("Pooja pawn brokers");
		
	}
	class inner{
		void display() {
			System.out.println("Hi Surana Family Bhadravathi");
		}
		
	}
}
	public class  MemberedInnerClass {
		public static void main(String[] args) {
			outer o=new outer();
			outer.inner oi=o.new inner();
			oi.display();
			
			
			
		}
	}
	
	

	
	
	
	

