import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Employee> listEmployees = new ArrayList<>();
		
		listEmployees.add(new Employee(101, "Zahid", "Mumbai", 2000.00));
		
		Employee e1 = new Employee(102, "Deepak", "Mumbai",  2100.00);
		listEmployees.add(e1);
		
		listEmployees.add(new Employee(103, "Akash", "Mumbai", 1200.00));
		listEmployees.add(new Employee(104, "Bhakti", "Mumbai", 4000.00));
		listEmployees.add(new Employee(105, "Mohit", "Mumbai", 5700.00));
		listEmployees.add(new Employee(106, "Saurabh", "Mumbai", 1000.00));
		listEmployees.add(new Employee(107, "Akash", "Mumbai", 500.00));

	
		Employee e2 = new Employee(101, "Zahid", "Mumbai", 2000.00);
		
		System.out.println(listEmployees.remove(e2));
		
		
		System.out.println(listEmployees);
		
	}
	

}
