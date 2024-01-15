//The toString() method returns the string representation of the object.
public class To {
	String name;
	int rollNo;
	
	public To(String name, int rollNo) {
	//	super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		To t1=new To("Vishal",99);
		//System.out.println(t1.name);
		//System.out.println(t1.rollNo);
		// if now I print t1 as it contain both name n rollNo will get error To@15db9742.
		System.out.println(t1);//--->By default in java This is equivalent to System.out.println(t1.toString); so we need overide toString 
		//System.out.println(t1.toString());
	}
	public String toString() {
		return name+ "=====" +rollNo;
		
	}
	

}
