package basics.com;

class Amount{
	private String currency;
	private int amount;
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount other) {
		 this.amount = this.amount+other.amount;
	}
	
	public String toString(){
		return amount + "  "+currency;
	}
}

public class Basic11ThrowingException {
	public static void main(String[] args) {
		Amount a = new Amount("usd", 10);
		Amount b = new Amount("usd", 20);
		a.add(b);
		System.out.println(a);
		Amount a1 = new Amount("usd", 10);
		Amount b1 = new Amount("inr", 20);
		a1.add(b1);
		System.out.println(a1);//this not correct it is also giving 30 since currency is different
		
	}

}
