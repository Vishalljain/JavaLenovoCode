   //MutableStrings:Strings are those which can be changed or altered.Open for Muation(mutation means change)
//IMMutableStrings:Strings are those which cannot be changed or altered.Not Open for Muation.(Not open to change)
//YES STRING ARE IMMUTABLE
//TO CREATE STRING THAT ARE IMMUTABLE WE USE THE STRING CLASS
//TO CREATE STRING THAT ARE MUTABLE WE CAN USE THE STRINGBUFFER CLASS OR STRINGBUILDERCLASS
public class ProveStringsAreImmutable {
	public static void main(String[] args) {
		String x="abc";
		String y="tech";
		x.concat(y);
		System.out.println(x);//we expect output to be abctech but it is abc so we cannot change x  it is still abc  so they are immutable
	}
	

}
//We can coclude strings are Immutable but using string buffer class it is mutable.