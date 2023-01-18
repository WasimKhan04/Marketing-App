package com.crudopeartions.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudopeartions.entities.Student;
import com.crudopeartions.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentrep;
	
	@Override
	public void saveOneForm(Student student) {
		studentrep.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> findAll = studentrep.findAll();
		return findAll;
	}

	@Override
	public void deleteOneStudent(Long id) {
		studentrep.deleteById(id);
	}

	@Override
	public Student findStudentById(Long id) {
		Optional<Student> findById = studentrep.findById(id);
		Student student = findById.get();
		return student;
	}
	
	



}
