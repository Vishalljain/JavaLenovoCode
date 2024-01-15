
public class UpperToLower {
	public static void main(String[] args) {
		String x="vishal";//Not applied this code for spaces
		char[] y=x.toCharArray();
		int size=y.length;
		int i=0;
		while(i!=size) {
			//y[i]=y[i]-32;//give error y[i]=a-32=>y[i]=97-32=>y[i]=65 but we have  here y[i]=65 but we want A.as we know A's asci code is 65 we are converting num to char
			y[i]=(char) (y[i]-32);
			i++;
		}
		System.out.println(y);
	}

}
//A =65;
//a =97
//lowercase-32 = uppercase
//uppercase = lowercase+32