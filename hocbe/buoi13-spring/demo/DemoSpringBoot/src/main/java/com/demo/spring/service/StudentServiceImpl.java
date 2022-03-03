package com.demo.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.entity.StudentEntity;
import com.demo.spring.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public StudentEntity save(StudentEntity student) {
		return studentRepo.saveAndFlush(student);
	}

	@Override
	public StudentEntity update(StudentEntity student) {
		return studentRepo.saveAndFlush(student);
	}

	@Override
	public void delete(StudentEntity student) {
		studentRepo.delete(student);
	}

	@Override
	public List<StudentEntity> getAll() {
		return studentRepo.findAll();
	}

	@Override
	public StudentEntity getById(Integer id) {
		return studentRepo.getById(id);
	}

}
