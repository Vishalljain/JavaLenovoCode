
public class StringContainsOnlyInteger {
public static void main(String[] args) {
	String x="012345678910";
	char[] y=x.toCharArray();
	int size=y.length;
	int i=0;
	while(i!=size)
	{
		if(y[i]>='0' && y[i]<='9')
		{
			i++;
		}
		else {
			System.out.println("Not an Integer check the string:"+x);
			System.exit(0);
			
		}
		
	}
	System.out.println("Great it is an Ineger");
	
}
}
