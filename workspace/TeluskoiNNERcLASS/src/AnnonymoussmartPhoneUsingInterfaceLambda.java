
public class AnnonymoussmartPhoneUsingInterfaceLambda {
	
	public static void main(String[] args) {
		
		Phone4 P4 =()-> System.out.println("Call,Camera,MusicPlayer");
		
		P4.specification();
		
	}

}
@FunctionalInterface
interface Phone4 {
	
	public void specification();
	
}
