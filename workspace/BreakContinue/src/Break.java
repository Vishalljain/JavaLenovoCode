//The break statement is  used to jump out of a loop.

//This example jumps out of the loop when i is equal to 8:

public class Break {
	public static void main(String[] args) { 
		int i;
		for(i=0;i<=10;i++) {
			if(i==8) {
				break;
			}
			System.out.println(i);
		}
	}

}
