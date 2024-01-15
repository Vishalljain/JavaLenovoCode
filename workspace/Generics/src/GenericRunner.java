
public class GenericRunner {
	public static void main(String[] args) {
		MyCustomList list=new MyCustomList();
		list.addElemet("element 1");
		list.addElemet("element 2");
		
		
		//Problem arises here because list is string n i m adding integers ..so i m making custom generics 
		//instead of String will add T so that we can add string and integers
		MyCustomList list2=new MyCustomList();
		//list2.addElemet(Integer.valueOf(0));
		//list2.addElemet(Integer.valueOf(4));
	}

}
