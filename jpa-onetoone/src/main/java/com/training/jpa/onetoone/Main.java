package com.training.jpa.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	 public static void main(String[] args) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testjpa");
	        EntityManager em = emf.createEntityManager();
	 
	        try {
	            em.getTransaction().begin();
	 
	            Customer customer = em.find(Customer.class, 1);
	 
	            System.out.println(customer.getName());
	            System.out.println(customer.getUser().getLogin());
	 
	            em.getTransaction().commit();
	        }
	        catch (Exception e) {
	            em.getTransaction().rollback();
	            e.printStackTrace();
	        }
	        finally{
	            emf.close();
	        }
	 
	        System.out.println("It is over");
	    }
}
