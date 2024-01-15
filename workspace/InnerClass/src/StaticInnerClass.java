//An inner class can also be static, which means that you can access it without creating an object of the outer class:

class outer1{
	int a=10;
	static class inner{
	 int n=10;
	 
	 
	 
}
}


public class StaticInnerClass {
	public static void main(String[] args) {
		outer1.inner oi=new outer1.inner();
	System.out.println(oi.n);
	
		
	}
	
	

}
