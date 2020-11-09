package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-demo");
	
		EntityManager manager = factory.createEntityManager();
		
		Employee emp = new Employee("aakash", "mumbai",  2000.00);
		
		
		EntityTransaction tx = manager.getTransaction();
//		
//		tx.begin();
//		manager.persist(emp);
//		tx.commit();
		
		Employee e1 = manager.find(Employee.class, 1L);
		
		System.out.println(e1);
		
//		tx.begin();
//		e1.setCity("Pune");
//		tx.commit();
		
		tx.begin();
		manager.remove(e1);
		tx.commit();
	}

}
