import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> setEmp = new TreeSet<>(new EmpSalComparator());
		
		setEmp.add(new Employee(101, "Zahid", "Mumbai", 2000.00));
		
		setEmp.add(new Employee(102, "Deepak", "Mumbai",  2100.00));
		
		setEmp.add(new Employee(103, "Akash", "Mumbai", 1200.00));
		
		setEmp.add(new Employee(104, "Bhakti", "Mumbai", 4000.00));
		
		setEmp.add(new Employee(105, "Mohit", "Mumbai", 5700.00));

		setEmp.add(new Employee(104, "Bhakti", "Mumbai", 4000.00));

		
		System.out.println(setEmp);
	}

}
