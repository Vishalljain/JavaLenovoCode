public class Practise {
	
	public void array(int arr[]) {
		int x =0;
		
		for(int i = 0 ;i<arr.length;i++) {
			x = arr[i]*arr[i]*arr[i];	
			System.out.println(x);
	}
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		Practise p = new Practise();
		p.array(arr);
		
		
		
	}

}
