package com.storephone.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.phone.spring.object.Phone;

@Controller
public class PhoneController {
	
	public List<Phone> danhSachDienThoai = new ArrayList<Phone>();
	
	public PhoneController(){
		danhSachDienThoai.add(new Phone("1", "SamSung", "4G", "Black", "10px"));
		danhSachDienThoai.add(new Phone("2", "SamSung", "4G", "Red", "20px"));
		danhSachDienThoai.add(new Phone("3", "SamSung", "4G", "Blue", "15px"));
		danhSachDienThoai.add(new Phone("4", "SamSung", "4G", "Green", "5px"));
		
	}
	@GetMapping("/phone")
	public String phone(Model model) {
		
		model.addAttribute("wecome", "chao mung ban den voi cua hang dien thoai");
		model.addAttribute("danhSachDienThoai", danhSachDienThoai);
		return "phone.html";
	}
	@RequestMapping(value="/savePhone", method = RequestMethod.POST)
	public String savePhone(@ModelAttribute Phone phone, Model model) {
		danhSachDienThoai.add(phone);
		model.addAttribute("wecome", "chao mung ban den voi cua hang dien thoai");
		model.addAttribute("danhSachDienThoai", danhSachDienThoai);
		return "phone.html";
	}
	@RequestMapping(value="/deletePhone", method = RequestMethod.GET)
	public String deletePhone(@RequestParam String phoneId,Model model) {
		for(int i= 0; i< danhSachDienThoai.size(); i++ ) {
			if(danhSachDienThoai.get(i).getId().equals(phoneId)) {
				danhSachDienThoai.remove(i);
			}
		}
		model.addAttribute("wecome", "chao mung ban den voi cua hang dien thoai");
		model.addAttribute("danhSachDienThoai", danhSachDienThoai);
		return "phone.html";
		
	}
	
}
