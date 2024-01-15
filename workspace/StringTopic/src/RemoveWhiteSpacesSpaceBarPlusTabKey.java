
public class RemoveWhiteSpacesSpaceBarPlusTabKey {
	public static void main(String[] args) {
		String x="Vishal Suhas Krishana Varun Subhash	Rohan	Prashanth	rahul";
		//x=x.replaceAll("\\t", "");//Vishal Suhas Krishana Varun SubhashRohanPrashanthrahul
		//x=x.replaceAll(" ","");//VishalSuhasKrishanaVarunSubhash	Rohan	Prashanth	rahul
		//x=x.replaceAll("\\s","");//VishalSuhasKrishanaVarunSubhashRohanPrashanthrahul
		System.out.println(x);
	}

}
