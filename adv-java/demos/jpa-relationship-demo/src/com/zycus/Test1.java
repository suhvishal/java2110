package com.zycus;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-relationship-demo");

		EntityManager em = factory.createEntityManager();
		
		
		
	}

}
