package com.tns.jpastart.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.jpastart.entities.Employee;
import com.tns.jpastart.entities.Manager;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		 Employee emp1=new Employee(); emp1.setName("Ash"); emp1.setSalary(10000); 
		 em.persist(emp1);
	
		Manager manager1=new Manager();
		manager1.setName("Corner");
		manager1.setSalary(35000);
		manager1.setDepartmentName("Tester");
		em.persist(manager1);
		 
		em.getTransaction().commit();
		System.out.println("Added one employee and manager to database.");
		
	}
		
		
		

}
