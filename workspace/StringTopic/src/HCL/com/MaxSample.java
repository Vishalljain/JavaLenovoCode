package HCL.com;

public class MaxSample {
	public static void main(String[] args) {
		int[] myarray= {6,1,8,2,100,6,9};
		int max =0;
		for(int i =0; i<myarray.length;i++) {
			if(myarray[i]>max) {
				max=myarray[i];
			}
		}
	
		System.out.println(max);
	}
}
