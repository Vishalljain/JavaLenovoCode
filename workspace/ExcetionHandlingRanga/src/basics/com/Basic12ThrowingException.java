package basics.com;

class Amount1{
	private String currency;
	private int amount;
	public Amount1(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount1 other) {
		if(!this.currency.equals(other.currency)) {
			throw new RuntimeException("CURRENCY DID NOT MATCH : "+this.currency+" & "+other.currency);//if i put only exception insted of runtime exception it would not work when ur throwing checked exception then u need to say throws and whoever calling u needs to handle it or throw it
		}
		 this.amount = this.amount+other.amount;
	}
	
	public String toString(){
		return amount + "  "+currency;
	}
}

public class Basic12ThrowingException {
	public static void main(String[] args) {
		Amount1 a = new Amount1("usd", 10);
		Amount1 b = new Amount1("usd", 20);
		a.add(b);
		System.out.println("Done"+a);
		Amount1 a1 = new Amount1("usd", 10);
		Amount1 b1 = new Amount1("inr", 20);
		a1.add(b1);
		System.out.println(a1);//this not correct it is also giving 30 since currency is different
		
	}

}
