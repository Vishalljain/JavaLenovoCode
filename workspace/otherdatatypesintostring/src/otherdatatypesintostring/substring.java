package otherdatatypesintostring;

public class substring {
	public static void main(String[] args) {
		String s="Bhadravathi";
		
		
		//B H A D R A V A T H I
		//0	1 2 3 4 5 6 7 8 9 10
		System.out.println(s.substring(2));//adravathi
		System.out.println(s.substring(4, 7));//rav
		System.out.println(s.substring(0, 11));//Bhadravathi
		//trim use
		String s1=" Bhadravathi ";
		System.out.println(s1.substring(2));//hadravathi
		System.out.println(s1.trim());
		System.out.println(""+s1.substring(2));
	}

}
