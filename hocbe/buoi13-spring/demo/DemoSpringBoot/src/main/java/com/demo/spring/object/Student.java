package com.demo.spring.object;

public class Student {

	private String id;
	private String name;
	private String school;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public Student(String id, String name, String school) {
		super();
		this.id = id;
		this.name = name;
		this.school = school;
	}
	
	
}
