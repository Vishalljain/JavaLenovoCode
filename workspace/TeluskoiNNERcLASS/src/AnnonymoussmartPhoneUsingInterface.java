
public class AnnonymoussmartPhoneUsingInterface {
	
	public static void main(String[] args) {
		
		Phone3 P3 = new Phone3() {
			public void specification() {
				System.out.println("Call,Camera,MusicPlayer");
			}
			
			
		};
		
		P3.specification();
		
	}

}

interface Phone3 {
	
	public void specification();
	
}
