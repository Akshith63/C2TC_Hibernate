package com.tns.jpaCrud.dao;

import com.tns.jpaCrud.Entities.Student;

public interface StudentDao {
	public abstract Student getStudentById(int id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
