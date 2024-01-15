
 class Machine {
	  String name;
	 int code;
	 public Machine() {
		// this(3,"vishal");
		 System.out.println("Hi Machine 1 is running");
	 }
	 public Machine(int code) {
		 this();
		 System.out.println("Hi Machine 2 is running");
	 }
	 public Machine(int code,String name) {
		 System.out.println("Hi machine 3 is running");
		 
	 }
 }
	 public  class App{
		 public static void main(String[] args) {
			// Machine m1=new Machine();
			 Machine m2=new Machine(1);
			 //Machine m3=new Machine(3,"Vishal");
			
		
		 
		 
	 }

}
