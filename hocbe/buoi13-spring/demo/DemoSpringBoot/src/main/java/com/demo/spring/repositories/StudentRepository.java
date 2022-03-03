package com.demo.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring.entity.StudentEntity;

@Repository(value = "StudentRepository")
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
