
public class UpperToLower3 {
public static void main(String[] args) {
	String x="vishal l surana";
	char[] y=x.toCharArray();
	int size=y.length;
	y[0]=(char)(y[0]-32);
	int i=1;//why 1 because i m converting v to V first only 
	while(i!=size) {
		if(y[i]==' ') {
			y[i+1]=(char) (y[i+1]-32);
		}
		
		
		i++;
	}
	System.out.println(y);
}
}
