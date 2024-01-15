package address.com;

public class Customer {
	private String name;
	private Address homeaddress;
	private Address workaddress;
	
	//we want name n homeaddress n optional work address..if mandatory include in constructor...if some one want to save work address they can set it using set address
	public Customer(String name, Address homeaddress) {
		super();
		this.name = name;
		this.homeaddress = homeaddress;
	}
	//i dont want to them to change name they can modify home address n workaddress so create seeter n getter for home and work address

	public Address getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}

	public Address getWorkaddress() {
		return workaddress;
	}

	public void setWorkaddress(Address workaddress) {
		this.workaddress = workaddress;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", homeaddress=" + homeaddress + ", workaddress=" + workaddress + "]";
	}
	
	
	//public String toString() {
		//return String.format("Name [%s], HomeAddress [%s],WorkAddress [%s]",name,homeaddress,workaddress);
	//}
	
	
	

}
