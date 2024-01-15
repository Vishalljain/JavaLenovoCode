package basics.com;

class Amount5{
	private String currency;
	private int amount;
	public Amount5(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount5 other) throws CurrencyDoNotMatchException {
		if(!this.currency.equals(other.currency)) {
			throw new CurrencyDoNotMatchException("CURRENCY DID NOT MATCH : "+this.currency+" & "+other.currency);//if i put only exception insted of runtime exception it would not work when ur throwing checked exception then u need to say throws and whoever calling u needs to handle it or throw it
		}
		 this.amount = this.amount+other.amount;
	}
	
	public String toString(){
		return amount + "  "+currency;
	}
}

class CurrencyDoNotMatchException extends Exception {


	public CurrencyDoNotMatchException(String string) {
		// TODO Auto-generated constructor stub
		System.out.println(string);
	}
	
	
	
}

public class Basic14ThrowingException {
	public static void main(String[] args) throws CurrencyDoNotMatchException {
		Amount5 a = new Amount5("usd", 10);
		Amount5 b = new Amount5("usd", 20);
		a.add(b);
		System.out.println("Done"+a);
		Amount5 a1 = new Amount5("usd", 10);
		Amount5 b1 = new Amount5("inr", 20);
		a1.add(b1);
		System.out.println(a1);//this not correct it is also giving 30 since currency is different
		
	}

}
