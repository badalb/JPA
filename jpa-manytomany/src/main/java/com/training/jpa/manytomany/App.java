package com.training.jpa.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.training.jpa.domain.Employee;
import com.training.jpa.domain.Meeting;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testjpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction userTransaction = em.getTransaction();

		userTransaction.begin();

		Meeting meeting1 = new Meeting("Quaterly Sales meeting");
		Meeting meeting2 = new Meeting("Weekly Status meeting");

		Employee employee1 = new Employee("Sergey", "Brin");
		Employee employee2 = new Employee("Larry", "Page");

		employee1.getMeetings().add(meeting1);
		employee1.getMeetings().add(meeting2);
		employee2.getMeetings().add(meeting1);

		em.persist(employee1);
		em.persist(employee2);

		userTransaction.commit();
		em.close();
		entityManagerFactory.close();

	}
}
