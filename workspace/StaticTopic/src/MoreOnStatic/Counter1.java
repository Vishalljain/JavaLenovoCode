package MoreOnStatic;

public class Counter1 {
	int counter=0;
	Counter1(){
		counter++;
		System.out.println(counter);
	}
	public static void main(String[] args) {
		Counter1 c1=new Counter1();
		Counter1 c2=new Counter1();
		Counter1 c3=new Counter1();
		
	}

}
//output is 1,1,1 because when we create each object it occupies separate memorey in heap for ex c1 occupies 101,c2 occupies 102 n c3 occupies 103