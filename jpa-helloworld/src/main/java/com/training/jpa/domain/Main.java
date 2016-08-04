package com.training.jpa.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testjpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction userTransaction = em.getTransaction();

		userTransaction.begin();
		Customer customer = new Customer();
		customer.setFirstName("Charles");
		customer.setLastName("Dickens");
		customer.setCustType("RETAIL");
		customer.setStreet("10 Downing Street");
		customer.setAppt("1");
		customer.setCity("NewYork");
		customer.setZipCode("12345");
		em.persist(customer);
		userTransaction.commit();
		em.close();
		entityManagerFactory.close();
	}
}
