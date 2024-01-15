
public final class ImmutableOneClass {
	
	private final  int id;
	private final String name;
	
	public ImmutableOneClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	public static void main(String[] args) {
		
		ImmutableOneClass ioc = new ImmutableOneClass(1, "Java");
		System.out.println(ioc.name=="Java");
		
		//ioc.id =100;//Remove final modifier of the id
			
			
		
	}
	
	
	
	

}
