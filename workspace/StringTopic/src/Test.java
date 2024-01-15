import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		String x = "hello";
		char[] y = x.toCharArray();
		int size = y.length;
		int i=0;
		char key ='e';
		String res = "";
		while(i!=size) {
			if(y[i]!=key) {
				res=res+y[i];
				
				
			}
			i++;
		}
		System.out.println(res);
	}
}
	

		
		