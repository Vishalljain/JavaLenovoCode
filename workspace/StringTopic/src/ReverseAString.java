//same as copy1stringtoanother
public class ReverseAString {
public static void main(String[] args) {
	String x="Vishal L";
	char[] y =x.toCharArray();
	int size= y.length;
	System.out.println(size);
	char[] a=new char[size];
	int i=0;
	while(i!=size) {
		a[size-1-i]=y[i];
		i++;
		
		
		
	}
	System.out.println(y);
	System.out.println(a);
	
}
}



