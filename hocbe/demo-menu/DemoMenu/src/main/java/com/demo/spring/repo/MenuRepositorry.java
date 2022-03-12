package com.demo.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring.entities.Menu;

@Repository
public interface MenuRepositorry extends JpaRepository<Menu, Integer> {

}
