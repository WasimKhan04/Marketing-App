package com.crudopeartions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudopeartions.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
