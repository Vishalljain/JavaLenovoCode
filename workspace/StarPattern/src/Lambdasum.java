interface interf{
	void sum(int a,int b);
}
public class Lambdasum {
	public static void main(String[] args) {
		interf i = (a,b)->System.out.println(a+b);
		i.sum(3, 7);
	}

}
