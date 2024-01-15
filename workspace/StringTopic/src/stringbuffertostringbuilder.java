
public class stringbuffertostringbuilder {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("John");//here sb is an object so to convert into string we use toString() method.
		String str = sb.toString();
		System.out.println(str);
		StringBuilder sbb = new StringBuilder(sb);
		System.out.println(sbb);
		
	}

}
//ToString:If you want to reprsent any object as a string toString method comes into existence.
