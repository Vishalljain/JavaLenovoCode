
public class StringOneD {

	public static void main(String[] args) {
		String [] fruits=new String[3];
		fruits[0]="Banana";
		fruits[1]="Apple";
		fruits[2]="Orange";
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		String[] names= {"Vishal","Suhas","Anmol","Rohan","Prashnath"};
		for(String name:names) {
			System.out.println(name);
		}
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
			
		}
		

	}
	

}

//A simple data structure which stores a collection of similar type of data in contigios block of memory.-one d
//datatype[] name = new dtatype[size]
//A simple data structure which stores multiple data element of similar type of data in the form of matrix or table like format-2d
//datatype[][] name = new datatype[rows][col]