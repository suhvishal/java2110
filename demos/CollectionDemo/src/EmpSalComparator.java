import java.util.Comparator;

public class EmpSalComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		Double emp1Sal = o1.getSalary();
		Double emp2Sal = o2.getSalary();
		
		return emp1Sal.compareTo(emp2Sal);
		
	}

}
