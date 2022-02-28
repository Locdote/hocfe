package com.demo.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.spring.object.Student;

@Controller
public class StudentController {
	
	public List<Student> danhSachHocSinh = new ArrayList<Student>();
	
	public StudentController() {
		danhSachHocSinh.add(new Student("1", "Nguyen Van A", "Thuong Cat1"));
		danhSachHocSinh.add(new Student("2", "Nguyen Van B", "Thuong Cat2"));
		danhSachHocSinh.add(new Student("3", "Nguyen Van C", "Thuong Cat3"));
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String getStudent(Model model) {
		model.addAttribute("chaoMung", "Chao mung den voi trang web student");
		model.addAttribute("danhSachHocSinh", danhSachHocSinh);
		return "student.html";
	}
	
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student, Model model) {
		System.out.println("da goi saveStudent" + student.getId() + "-" + student.getName() + "-" + student.getSchool());
		
		danhSachHocSinh.add(student);
		
		model.addAttribute("chaoMung", "Chao mung den voi trang web student");
		model.addAttribute("danhSachHocSinh", danhSachHocSinh);
		return "student.html";
	}
	
	@RequestMapping(value="/deleteStudent", method = RequestMethod.GET)
	public String deleteStudent(@RequestParam String studentId, Model model) {
		for(int i = 0; i < danhSachHocSinh.size(); i++) {
			if(danhSachHocSinh.get(i).getId().equals(studentId)) {
				danhSachHocSinh.remove(i);
			}
		}
		
		model.addAttribute("chaoMung", "Chao mung den voi trang web student");
		model.addAttribute("danhSachHocSinh", danhSachHocSinh);
		return "student.html";
	}
	
	@RequestMapping(value="/goToEditStudent", method = RequestMethod.GET)
	public String goToEditStudent(@RequestParam String studentId, Model mode) {
		Student student = new Student("", "", "");
		for(int i = 0; i < danhSachHocSinh.size(); i++) {
			if (danhSachHocSinh.get(i).getId().equals(studentId))
				student = danhSachHocSinh.get(i);
		}
		
		mode.addAttribute("student", student);
		return "editStudent.html";
	}
	
	@RequestMapping(value="/editStudent", method = RequestMethod.POST)
	public String editStudent(@ModelAttribute Student student, Model model) {

		System.out.println("aaaaaaaa: " + student.getId());
		System.out.println("aaaaaaaa: " + student.getName());
		System.out.println("aaaaaaaa: " + student.getSchool());
		
		for(int i = 0; i < danhSachHocSinh.size(); i++) {
			if (danhSachHocSinh.get(i).getId().equals(student.getId())) {
				danhSachHocSinh.get(i).setName(student.getName());
				danhSachHocSinh.get(i).setSchool(student.getSchool());
			}
		}
		model.addAttribute("chaoMung", "Chao mung den voi trang web student");
		model.addAttribute("message", "Sua thanh cong hoc sinh co ID: " + student.getId());
		model.addAttribute("danhSachHocSinh", danhSachHocSinh);
		
		return "student.html";
	}
}
