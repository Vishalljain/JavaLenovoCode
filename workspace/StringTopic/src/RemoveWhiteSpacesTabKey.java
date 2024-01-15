
public class RemoveWhiteSpacesTabKey {
	public static void main(String[] args) {
		String x="Dayananda	Sagar	University";
		x=x.replaceAll("\\t", "");
		System.out.println(x);
	}

}
