  
public class VerifyIfOneStringIsARotationOfAnotherString {
	public static void main(String[] args) {
		String OriginalString="aradhya";
		String KeyString="radhya";
		String NewString  = OriginalString.concat(OriginalString);
		System.out.println(NewString);
		if(NewString.contains(KeyString)) {
			System.out.println("Rotational String");
		}
			else {
				System.out.println("Non_Rotational String");
			}
		}
	}
	





//aradhya:rotational strings are as follow move one character at end
//radhyaa
//adhyaar
//dhyaara
//hyaarad
//yaaradh
//aaradhy
//Alogorithm:1)concatenate org string with itself
//2)verify new string contain original String by using contains method
//aradhyaaradhya-->first step down 2nd step
// radhyaa     hence rotational
//aradhyaaradhya
//  adhyaar     hence rotational
///aradhyaaradhya
//    dhyaara     hence rotational

