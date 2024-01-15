//Methodoverloading
class over{
	
		public void disp(char c) {
			System.out.println(c);
		}
		public void disp(char c, int a) {
			System.out.println(c+" "+a);
		}
		
	}
public class Execute{
	public static void main(String[] args) {
		
		over ol = new over();
		ol.disp('a');
		ol.disp('a', 10);
		
	}

}
