package UncheckedException;

import java.util.Optional;

//1)Unchecked exception:Unchecked are the exceptions that are not checked at compiled time. 
//ex are null point exception,array bound exception

//If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.
public class NullPointException {
	public static void main(String[] args) {
//		String name="Vishal L";
//		System.out.println("The length is "+ name.length());
//		//The below code will throw null point exception
//		
	String name1=null;
//		System.out.println("The length is "+ name1.length());
//	}
	Optional<String> opt = Optional.ofNullable(name1);
	if(opt.isPresent()){
		System.out.println(name1.length());
		System.out.println(opt.get());
	}
	else {
		System.out.println(opt.get());
		System.out.println("it is a null value");
	}
		
	}
		

}
