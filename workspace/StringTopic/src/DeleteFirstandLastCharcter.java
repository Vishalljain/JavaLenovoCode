
public class DeleteFirstandLastCharcter {
	public static void main(String[] args) {
		String example = "Java Interview";
		int len = example.length();
		System.out.println(example.substring(1,len-1));
		//using string builder
		StringBuilder sb = new StringBuilder("Java Interview");
		sb.deleteCharAt(0);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		
	}

}
