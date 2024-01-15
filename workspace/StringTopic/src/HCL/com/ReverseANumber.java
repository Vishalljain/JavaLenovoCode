package HCL.com;

public class ReverseANumber {
	
	public static void main(String[] args)   
	{  
	int number = 987654, reverse = 0;  
	while(number != 0)   
	{  
	int remainder = number % 10; 
	System.out.println("Re:"+remainder);
	reverse = reverse * 10 + remainder; 
	System.out.print(reverse);
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	

}
