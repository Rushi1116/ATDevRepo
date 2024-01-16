package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.exceptions.StudentNotFoundException;
import com.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{rollno}")
    public Optional<Student> getStudentById(@PathVariable Long rollno) {
        return studentService.getStudentById(rollno);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping("/{rollno}")
    public void deleteStudent(@PathVariable Long rollno) {
        studentService.deleteStudent(rollno);
    }

    @PostMapping("/update/{rollno}")
    public Student updateStudent(@PathVariable Long rollno, @RequestBody Student updatedStudent) {
        try {
			return studentService.updateStudent(rollno, updatedStudent);
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}
		return updatedStudent;
    }
}
