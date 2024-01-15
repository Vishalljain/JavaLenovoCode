package HCL.com;

public class MaxMinArray {
	public static void main(String[] args) {
		int[] myarray= {6,1,8,2,6,9};
		MaxMinArray m1 = new MaxMinArray();
		System.out.println("Max is: "+m1.maxArray(myarray));
		System.out.println("Min is : "+m1.minArray(myarray));
	}

	private int maxArray(int[] myarray) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<myarray.length;i++) {
			if(myarray[i]>max) {
			max=myarray[i];
		}
		}
		return max;
		
		
	}
	
	private int minArray(int[] myarray) {
		int min =Integer.MAX_VALUE;
		for(int i =0;i<myarray.length;i++) {
			if(myarray[i]<min)
			min=myarray[i];
		}
		return min;
		
		
	}

}
