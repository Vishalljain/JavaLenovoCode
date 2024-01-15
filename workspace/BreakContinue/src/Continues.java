//The continue statement breaks one iteration (in the loop), if a specified condition occurs,
//and continues with the next iteration in the loop.

//This example skips the value of 0:
public class Continues {
	public static void main(String[] args) {
		for(int i=0;i<=15;i++) {
			if(i==0 || i == 13) {
				continue;
			}
			System.out.println(i);
		}
	}
	

}
