import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Employee> setEmp = new HashSet<>();
		
		setEmp.add(new Employee(101, "Zahid", "Mumbai", 2000.00));
		
		setEmp.add(new Employee(102, "Deepak", "Mumbai",  2100.00));
		
		setEmp.add(new Employee(103, "Akash", "Mumbai", 1200.00));
		
		setEmp.add(new Employee(104, "Bhakti", "Mumbai", 4000.00));
		
		setEmp.add(new Employee(105, "Mohit", "Mumbai", 5700.00));

		setEmp.add(new Employee(104, "Bhakti", "Mumbai", 4000.00));

		
		System.out.println(setEmp);
		
//		Employee e1 = new Employee(101, "Zahid", "Mumbai", 2000.00);
//		
//		Employee e2 = new Employee(101, "Zahid", "Mumbai", 2000.00);
//		
//		System.out.println("e1 - hashCode = " + e1.hashCode());
//		System.out.println("e2 - hashCode = " + e2.hashCode());

	}

}
