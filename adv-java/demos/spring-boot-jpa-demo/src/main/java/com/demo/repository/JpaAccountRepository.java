package com.demo.repository;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.demo.entities.Account;

@Repository("jpa")
public class JpaAccountRepository implements AccountRepository {
	
	@PersistenceContext
	private EntityManager EntityManager;

	@Override
	public Account findAccountByNumber(Long accountNUmber) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findAllAccounts() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Account account) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Account account) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Account account) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
