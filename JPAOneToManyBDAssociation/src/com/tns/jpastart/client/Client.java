package com.tns.jpastart.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.jpastart.entities.Department;
import com.tns.jpastart.entities.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Department department=new Department();
		department.setId(1);
		department.setName("MECH");
		
		Department department1=new Department();
		department1.setId(2);
		department1.setName("CIVIL");
		
		Employee employee1=new Employee();
		employee1.setEid(111);
		employee1.setEname("Akshith");
		employee1.setEsalary(500);
		
		Employee employee2=new Employee();
		employee2.setEid(112);
		employee2.setEname("Madhu");
		employee2.setEsalary(1000);
		
		Employee employee3=new Employee();
		employee3.setEid(211);
		employee3.setEname("Nandan");
		employee3.setEsalary(5000);
		
		
		Employee employee4=new Employee();
		employee4.setEid(212);
		employee4.setEname("Bharath");
		employee4.setEsalary(10000);
		
		department.addEmployee(employee1);
		department.addEmployee(employee2);
		department1.addEmployee(employee3);
		department1.addEmployee(employee4);
		
		em.persist(department);
		em.persist(department1);
		
		System.out.println("Added department along with two employees to database.");
		
		em.getTransaction().commit();
	}
	
	}
