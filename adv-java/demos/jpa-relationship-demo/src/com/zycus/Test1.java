package com.zycus;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.zycus.entities.Author;
import com.zycus.entities.Book;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-relationship-demo");

		EntityManager em = factory.createEntityManager();
		
		//Author a1 = new Author("vishal", "shah", "some bio", LocalDate.of(1999, 2, 21), 23);
		
//		Author a2 = em.find(Author.class, 1);
//		
//		Book b1 = new Book("book1",  "desc of book 1", 12.2F, "asdfadfa", 100, LocalDate.of(2020, 1, 1), a2);
//		
//		em.getTransaction().begin();
//		em.persist(b1);
//		em.getTransaction().commit();
		
		
//		Author a1 = new Author("vishal", "shah", "Mumbai", LocalDate.of(1999, 2, 21), 23);
//		Author a2 = new Author("Aakash", "Khandelia", "Pune", LocalDate.of(1999, 2, 21), 20);
//		Author a3 = new Author("Deepak", "Jaiswar", "Mumbai", LocalDate.of(1999, 2, 21), 21);
//		
//		Set<Author> set = new HashSet<>();
//		set.add(a1);
//		set.add(a2);
//		set.add(a3);
//		
//		Book book1 = new Book("book1",  "desc of book 1", 12.2F, "asdfadfa", 100, LocalDate.of(2020, 1, 1), set );
//		
//		
//		
//		em.getTransaction().begin();
//		em.persist(book1);
//		em.getTransaction().commit();
//		
		
		//custom quries using jpql statement 
//		Query query = em.createQuery("SELECT a from Author a WHERE a.bio=:city");
//		query.setParameter("city",  "Mumbai");
//		
//		List<Author> list = (List<Author>) query.getResultList();
//	
//		for(Author author : list) {
//			System.out.println(author);
//		}
		
		
//		TypedQuery<Author> query = em.createQuery("SELECT a from Author a WHERE a.bio=:city", Author.class);
//		query.setParameter("city",  "Mumbai");
//		
//		List<Author> list = query.getResultList();
//	
//		for(Author author : list) {
//			System.out.println(author);
//		}
		
		
		TypedQuery<Author> query = em.createNamedQuery("findByCity", Author.class);
		query.setParameter("city",  "Mumbai");
		
		List<Author> list = query.getResultList();
	
		for(Author author : list) {
			System.out.println(author);
		}
	}

}
