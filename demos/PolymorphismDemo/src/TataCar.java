
public class TataCar extends Car {
	
	public  TataCar() {
		// TODO Auto-generated constructor stub
	}

	public static void methodA() {
		System.out.println("Car class static method");
	}
	
	public TataCar(String name) {
		super(name);
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "  car moves normally....");
	}

	
}
