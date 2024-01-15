/*
 * static block is executed once and it is executed before main method.
 * A class can have multiple static blocks and it will executed from bottom to up
 * static blocks are used to initializes the static data members
 * */




public class StaticBlock {// A class can have multiple static blocks and it will executed from bottom to up
	static {
		System.out.println("Bhadravathi");
		//System.exit(0);
	}
	static {
		System.out.println("Bangalore");
		
	}
	public static void main(String[] args) {
		System.out.println("Chennai");
	}
	static {
		System.out.println("Karnataka");
	}
	

}
