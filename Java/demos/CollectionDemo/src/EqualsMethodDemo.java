
public class EqualsMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(102, "Deepak", "Mumbai",  2100.00);
		Employee e2 = new Employee(101, "Zahid", "Mumbai", 2000.00);

		
		if(e1.equals("Stringobject")) {
			System.out.println("both objects are same...");
		}else {
			System.out.println("not same...");
		}
		
	}

}
