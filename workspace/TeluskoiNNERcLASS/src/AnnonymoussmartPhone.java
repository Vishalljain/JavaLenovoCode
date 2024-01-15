
public class AnnonymoussmartPhone {
	
	public static void main(String[] args) {
		
		Phone P = new Phone() {
			public void specification() {
				System.out.println("Call,Camera,MusicPlayer");
			}
			
			
		};
		
		P.specification();
		
	}

}

class Phone {
	
	public void specification() {
		System.out.println("Call");
	}
	
}
