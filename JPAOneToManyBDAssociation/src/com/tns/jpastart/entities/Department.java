package com.tns.jpastart.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	private int dptid;
	
	private String name;
	
	@OneToMany( mappedBy ="department",cascade=CascadeType.ALL)
	private	Set<Employee> employees= new HashSet<>();

	public int getId() {
		return dptid;
	}

	public void setId(int id) {
		this.dptid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

public void addEmployee(Employee employee)
{
	employee.setDepartment(this);
	this.getEmployees().add(employee);
}

}
