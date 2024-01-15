class phone1  {
	public void specification() {
		System.out.println("Call");
	}

}

public class WhyAnonymous extends phone1{
	
	public void specification() {
		System.out.println("Call,Camera,MusicPlayer");
	}
	
	public static void main(String[] args) {
		phone1 p = new WhyAnonymous();
		p.specification();
	}
	
	
}

//dont want to create additional class and extend it 