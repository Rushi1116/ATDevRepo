package com.student.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exceptions.StudentNotFoundException;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService  {

	@Autowired
    private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		 return studentRepository.findAll();
	}

	@Override
	public Optional<Student> getStudentById(Long rollno) {
		return studentRepository.findById(rollno);
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long rollno) {
		studentRepository.deleteById(rollno);
	}

	@Override
	public Student updateStudent(Long rollno, Student updatedStudent) throws StudentNotFoundException {
		 if (studentRepository.existsById(rollno)) {
		        updatedStudent.setRollNo(rollno);
		        return studentRepository.save(updatedStudent);
		    } else {
		        throw new StudentNotFoundException("Student with roll number " + rollno + " not found");
		    }	 
    }

}
