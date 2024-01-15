
public class Palindrome2 {
	public static void main(String[] args) {
		//String x="too hot to hoot";//To remove apace=>tohottohoot->Done
		String x="too HOT to Hoot";//to lower or upper case
		x=x.replace(" ", "");
		x=x.toUpperCase();//TOOHOTTOHOOT
		System.out.println(x);
		char y[] =x.toCharArray();
		int size=y.length;
		char b[]=new char[size];
		int i=0;
		while(i!=size) {
			b[size-1-i]=y[i];
			i++;
		}
		i=0;
		while(i!=size) {
			if(b[i]!=y[i]) {
				System.out.println("Not pallindrome");
				System.exit(0);
				
				
			}
			else {
				i++;
				continue;
			}
		}
		System.out.println("palindrome");
	}

}




