package com.demo.spring.service;

import java.util.List;

import com.demo.spring.entity.StudentEntity;

public interface StudentService {

	public StudentEntity save(StudentEntity student);
	public StudentEntity update(StudentEntity student);
	public void delete(StudentEntity student);
	public List<StudentEntity> getAll();
	public StudentEntity getById(Integer id);
}
