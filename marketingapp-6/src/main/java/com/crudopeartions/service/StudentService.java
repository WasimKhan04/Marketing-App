package com.crudopeartions.service;

import java.util.List;

import com.crudopeartions.entities.Student;

public interface StudentService {

	public void saveOneForm(Student student);
	
	List<Student> getAllStudent();
	
	public void deleteOneStudent(Long id);

	public Student findStudentById(Long id);

	
	
	
}
