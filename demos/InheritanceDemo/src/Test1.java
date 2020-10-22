
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		Employee e = new Employee();
		
		p = null;		// object becomes eligible for garbadge collection 
		
		System.gc();
		System.out.println("end");
		
	}

}
