
public abstract class Car {
	
	private String name;

	public Car() {
		
	}
	
	public static void methodA() {
		System.out.println("Car class static method");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car(String name) {
		this.name = name;
	}
	
	public abstract void move();
}
