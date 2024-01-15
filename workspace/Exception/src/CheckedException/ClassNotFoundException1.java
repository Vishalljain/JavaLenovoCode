package CheckedException;

public class ClassNotFoundException1 {
	public static void main(String[] args) {
		try {
			Class.forName("UncheckedException.ArrayBoundException");//packagename.classname
		//	Class.forName("UncheckedException.ArrayBoundException11");//class not found exception
			System.out.println("Class found :)");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getStackTrace());
			System.out.println("Class not found");
		}
		
	}

}
