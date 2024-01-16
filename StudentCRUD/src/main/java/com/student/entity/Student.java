package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "student")
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rollno;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    
	public Long getRollNo() {
		return rollno;
	}

	public void setRollNo(Long rollno) {
		this.rollno = rollno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student() {
		super();
	}

	public Student(Long rollno, String firstName, String lastName, int age, String email) {
		super();
		this.rollno = rollno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
	}
    
    
}
