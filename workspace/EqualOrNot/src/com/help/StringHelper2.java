package com.help;

public class StringHelper2 {
	public String truncateAInFirst2Positions(String str) {
	if (str.length() <= 2)
	//	return str.replaceAll("A", "");
		System.out.println("Inside 1:"+str.replaceAll("A", ""));
	
	
	String first2Chars = str.substring(0, 2);
	System.out.println("Inside first2Chars :"+first2Chars);
	String stringMinusFirst2Chars = str.substring(2);
	System.out.println("Inside stringMinusFirst2Chars: "+stringMinusFirst2Chars);

	return first2Chars.replaceAll("A", "") 
			+ stringMinusFirst2Chars;

	}
}


/*
ACDAA-->
Inside first2Chars :AC
Inside stringMinusFirst2Chars: DAA
CDAA

FOR ACB ->LENGTH =3
substring(0,2)->AC
substring(2)->B


*/