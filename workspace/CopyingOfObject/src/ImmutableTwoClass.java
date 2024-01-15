class Engine {
	int speed;

	public Engine(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Engine [speed=" + speed + "]";
	}

}

public final class ImmutableTwoClass {
	private final int id;
	private final String name;
	private final Engine engine;

	public ImmutableTwoClass(int id, String name, Engine engine) {
		super();
		this.id = id;
		this.name = name;
		// this.engine = engine;
		Engine newEngine = new Engine(engine.speed);
		this.engine = newEngine;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ImmutableTwoClass [id=" + id + ", name=" + name + ", engine=" + engine + "]";
	}

	public static void main(String[] args) {

		Engine e1 = new Engine(50);
		ImmutableTwoClass i2c = new ImmutableTwoClass(1, "Benz", e1);
		System.out.println("Before" + i2c.engine.speed);
		e1.speed = 100;
		System.out.println("After" + i2c.engine.speed);

	}

}
