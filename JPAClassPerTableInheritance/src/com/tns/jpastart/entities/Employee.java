package com.tns.jpastart.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee1")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)	

public class Employee {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		
		private int eid;
		private String ename;
		private double esalary;
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public double getEsalary() {
			return esalary;
		}
		public void setEsalary(double esalary) {
			this.esalary = esalary;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
	
}
