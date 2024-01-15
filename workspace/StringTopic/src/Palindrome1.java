
public class Palindrome1 {
	public static void main(String[] args) {
		String x="refer";
		//String x="too hot to hoot";//Not working
		char y[] =x.toCharArray();//too hot to hoot
		int size=y.length;
		//System.out.println(size);
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
				//continue;
			}
		}
		System.out.println("palindrome");
	}

}

