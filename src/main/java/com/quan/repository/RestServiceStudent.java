package com.quan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.quan.model.Student;
//localhost:8080/students
@RepositoryRestResource(collectionResourceRel = "students", path = "students") //students
public interface RestServiceStudent  extends JpaRepository<Student, Integer>{

}
