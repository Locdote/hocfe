package com.demo.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.entities.Menu;
import com.demo.spring.repo.MenuRepositorry;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuRepositorry menuRepo;
	
	@Override
	public List<Menu> getAllMenu() {
		return menuRepo.findAll();
	}

}
//annotation trong java