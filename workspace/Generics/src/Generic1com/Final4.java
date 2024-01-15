package Generic1com;

class Final4 {
	//public static void printArray(int[] inputArray)--normal method
public static <T>  void printArray(T[] inputArray) {
//	for(int element :inputArray)normal method
	for(T element: inputArray) {
		System.out.println(element);	
	}
	
	
}
public static void main(String[] args) {
	Integer[] intArray= {1,2,3,4,5};
	Double[] douArray = {1.1,2.2,3.3,4.4,5.5};
	printArray(intArray);
	printArray(douArray);
}
}