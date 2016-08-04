package com.training.jpa.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testjpa");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();

			Customer customer = new Customer();
			customer.setName("John Doe");

			User user = new User();
			user.setLogin("jDoe");
			user.setPassword("123changeME!@#");

			customer.setUser(user);

			em.persist(customer);

			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			emf.close();
		}

		System.out.println("It is over");
	}
}
