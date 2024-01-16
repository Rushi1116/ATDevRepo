package com.student.service;

import java.util.List;
import java.util.Optional;

import com.student.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Optional<Student> getStudentById(Long id);
	
	Student addStudent(Student student);
	
	void deleteStudent(Long id);
	
	Student updateStudent(Long id, Student updatedStudent);
}
