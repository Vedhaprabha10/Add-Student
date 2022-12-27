package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>   // Student is jpa entity, Integer is datatype of given primary key
{		

	Student findByfirstname(String firstname);
	
	//sList<Student> findById(Student id);
}
