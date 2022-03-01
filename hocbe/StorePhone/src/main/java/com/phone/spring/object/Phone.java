package com.phone.spring.object;

public class Phone {
	private String id;
	private String name;
	private String ram;
	private String color;
	private String camera;
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
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public Phone(String id, String name, String ram, String color, String camera) {
		super();
		this.id = id;
		this.name = name;
		this.ram = ram;
		this.color = color;
		this.camera = camera;
	}
	
}
