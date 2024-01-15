
public class LinearSearch {
	static int index = -1;
	public static void main(String[] args) {
	
	int[] arr = {1,2,3,4,5};
	int n = 5;
	if (search(arr,n)) {
		System.out.println("Found : "+index);
	}
	else {
		System.out.println("Not Found");
	}
	
	

}

	private static boolean search(int[] arr, int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				index = i;
				return true;
			}
			
		}
		return false;
	}
}