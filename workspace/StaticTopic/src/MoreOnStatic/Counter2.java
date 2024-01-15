package MoreOnStatic;

public class Counter2 {
	static int counter=0;
	Counter2(){
		counter++;
		
	}
	
	public static void main(String[] args) {
		Counter2 c1=new Counter2();
		Counter2 c2=new Counter2();
		Counter2 c3=new Counter2();
		System.out.println(counter);
		
	}

}
//output is 
//1,2,3 because c1,c2,c3 objects points to class area or method area 
//here c1 refers to class not object
