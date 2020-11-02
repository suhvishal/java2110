
public class BMWCar extends Car {

	public BMWCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BMWCar(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "  car moves fast...");
	}

}
