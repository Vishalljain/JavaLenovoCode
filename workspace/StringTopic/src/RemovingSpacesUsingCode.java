
public class RemovingSpacesUsingCode  {
	public static void main(String[] args) {
		String x="Cognizant Technology Solutions";
		char y[]=x.toCharArray();
		String str="";
		int size=y.length;
		for(int i=0;i<size;i++) {
			if(y[i]!=' ') {
				System.out.println(str=str+y[i]);
				
				
				
				
			}
			
		}
	}

}
