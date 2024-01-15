//remove s from string
public class DeleteAllOccurrencesOfAGivenCharacterFromAString {
	public static void main(String[] args) {
		String x="sillyspyders";
		char[] y=x.toCharArray();
		int size=y.length;
		int i=0;
		char key='s';
		String res="";
		while(i!=size) {
			if(y[i]!=key) {
				res=res+y[i];
				
			}
			i++;
			System.out.println(res);
		}
		
	}

}
