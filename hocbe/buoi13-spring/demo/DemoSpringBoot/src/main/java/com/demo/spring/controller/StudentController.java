package com.demo.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.spring.entity.StudentEntity;
import com.demo.spring.object.Student;
import com.demo.spring.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String getStudent(Model model) {
		List<StudentEntity> danhSachHs = studentService.getAll();
		model.addAttribute("chaoMung", "Chao mung den voi trang web student");
		model.addAttribute("danhSachHocSinh", danhSachHs);
		return "student.html";
	}
	
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student, Model model) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setName(student.getName());
		studentEntity.setSchool(student.getSchool());
		
		studentService.save(studentEntity);
		
		List<StudentEntity> danhSachHs = studentService.getAll();
		model.addAttribute("chaoMung", "Chao mung den voi trang web student");
		model.addAttribute("danhSachHocSinh", danhSachHs);
		return "student.html";
	}
	
	@RequestMapping(value="/deleteStudent", method = RequestMethod.GET)
	public String deleteStudent(@RequestParam String studentId, Model model) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setId(Integer.valueOf(studentId));
		studentService.delete(studentEntity);
		
		List<StudentEntity> danhSachHs = studentService.getAll();
		
		model.addAttribute("chaoMung", "Chao mung den voi trang web student");
		model.addAttribute("danhSachHocSinh", danhSachHs);
		return "student.html";
	}
	
	@RequestMapping(value="/goToEditStudent", method = RequestMethod.GET)
	public String goToEditStudent(@RequestParam String studentId, Model mode) {

		StudentEntity studentEntity = studentService.getById(Integer.valueOf(studentId));
		mode.addAttribute("student", studentEntity);
		return "editStudent.html";
	}
	
	@RequestMapping(value="/editStudent", method = RequestMethod.POST)
	public String editStudent(@ModelAttribute Student student, Model model) {

		
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setId(Integer.valueOf(student.getId()));
		studentEntity.setName(student.getName());
		studentEntity.setSchool(student.getSchool());
		
		studentService.update(studentEntity);
		
		List<StudentEntity> danhSachHs = studentService.getAll();
		
		model.addAttribute("chaoMung", "Chao mung den voi trang web student");
		model.addAttribute("message", "Sua thanh cong hoc sinh co ID: " + student.getId());
		model.addAttribute("danhSachHocSinh", danhSachHs);
		
		return "student.html";
	}
}
