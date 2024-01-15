package basics.com;

class Amount3{
	private String currency;
	private int amount;
	public Amount3(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount3 other) throws Exception {
		if(!this.currency.equals(other.currency)) {
			throw new Exception("CURRENCY DID NOT MATCH : "+this.currency+" & "+other.currency);//if i put only exception insted of runtime exception it would not work when ur throwing checked exception then u need to say throws and whoever calling u needs to handle it or throw it
		}
		 this.amount = this.amount+other.amount;
	}
	
	public String toString(){
		return amount + "  "+currency;
	}
}

public class Basic13ThrowingException {
	public static void main(String[] args) throws Exception {
		Amount3 a = new Amount3("usd", 10);
		Amount3 b = new Amount3("usd", 20);
		a.add(b);
		System.out.println("Currency Matched : "+a);
		Amount3 a1 = new Amount3("usd", 10);
		Amount3 b1 = new Amount3("inr", 20);
		a1.add(b1);
		System.out.println(a1);//this not correct it is also giving 30 since currency is different
		
	}

}
