
public class UpperToLower2 {
public static void main(String[] args) {
		String x="vishal l surana";
		char[] y=x.toCharArray();
		int size=y.length;
		int i=0;
		while(i!=size) {
			if(y[i]!=' ')//Remove Space
			{
			y[i]=(char) (y[i]-32);
			}
			i++;
		}
		System.out.println(y);
	}

}


