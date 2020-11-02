
public class Employee {

	protected void finalize() throws Throwable { 
		System.out.println("Deleting Employee object...");
	}
}
