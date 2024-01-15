
public class CountNoOfWordsInAString {
	public static void main(String[] args) {
		String x="Vishal Rohan Prashanth";
		String y[]=x.split(" ");
		
		//whenver it sees space it splits n stored in array as 0=vis,1=roh,2=prashu
		System.out.println(y);
		System.out.println(y.length);
	}

	

}
