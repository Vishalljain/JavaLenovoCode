
public class CharacterCount {
	public static void main(String[] args) {
		String S = "Vvishalljain";
		long count = S.chars().filter(s->s=='j').count();
		System.out.println(count);
	}

}
