package address.com;

public class CustomerRunner {
	public static void main(String[] args) {
		Address homeaddress = new Address("line1", "Bhadravathi","577301");
		Customer customer = new Customer("Ranga", homeaddress );
		
		Address workaddress = new Address("line2", "Banagalore", "566302");
		customer.setWorkaddress(workaddress );
		System.out.println(customer);
		
	}

}
