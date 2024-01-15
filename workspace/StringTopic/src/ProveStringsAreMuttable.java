
public class ProveStringsAreMuttable {
	public static void main(String[] args) {
		StringBuffer x=new StringBuffer("abc");
		StringBuffer y=new StringBuffer("tech");
		x.append(y);
		System.out.println(x);
		
	}

}
//If interviwer asked string are mutable or Immutable 
//Ans will be immutable but if we use string buffer class string are mutable.
