package com.tns.jpastart.entities;


import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="manager")


public class Manager extends Employee {
	
	
		
	
		private static final long serialVersionUID = 1L;
		
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		
		}
		
		

	}


