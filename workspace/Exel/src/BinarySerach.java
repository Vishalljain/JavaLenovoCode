
public class BinarySerach {
	static int index = -1;
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7};
		int n = 5;
		
		if (search(arr,n)) {
			System.out.println("Found at position : "+index);
			
		}
		else {
			System.out.println("Not Found");
		}
		
		
	}

	private static boolean search(int[] arr, int n) {
		int lowerBound = 0;
		int mid =0;
		int upperBound = arr.length-1;
		for(int i = 0; i <arr.length;i++) {
			 mid = (lowerBound + upperBound)/2;
			 if(arr[mid]==n) {
				 index = mid;
				 return true;
			 }
			 else {
				 if (arr[mid]<n) {
					 lowerBound = mid+1;
					 
				 }
				 else {
					 upperBound = mid-1;
				 }
			 }
			
		}
			
		
		
		return false;
	}

}
