//we need to use null to know where data ends and where to stop count.so we need to concanete /0 using concat function at last
// ABCTECH-->ABCTech/0
public class LenWithoutInbuilt {
	public static void main(String[] args) {
		String x= "ABC Tech";
		x=x.concat("\0");//Concatenates the specified string to the end of this string. 
		char[] c=x.toCharArray();
		
		int count=0;
		int i=0;
		while(c[i]!='\0') {
			i++;
		    count++;
			
			
		   
		}
		 System.out.println(i);
		System.out.println(count);
		
		//oR simply using length method 
		String a="ABC tech";
		System.out.println(a.length());
	}
	
	
	

}
