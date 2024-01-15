
public class BiNumberRunner {
	public static void main(String[] args) {
		BiNumber numbers =new BiNumber(2,3);
		System.out.println(numbers.add());//5
		System.out.println(numbers.multiply());//6
		
		numbers.doubleValue();//double both the numbers
		
		System.out.println(numbers.getNumber1());//4
		System.out.println(numbers.getNumber2());//6
		
	}

}
