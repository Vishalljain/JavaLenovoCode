package SerialDemo2;

import java.io.Serializable;
//iF THERE IS ANY STATIC DATA MEMBER IN  A CLASS IT WILL NOT BE SERIALIZED AS IT IS PART OF CLASS NOT OBJECT 

@SuppressWarnings("serial")
public class StaticSerializable implements Serializable  {
	int id;
	String name;
	static String clg = "DSU" ;
	public StaticSerializable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
