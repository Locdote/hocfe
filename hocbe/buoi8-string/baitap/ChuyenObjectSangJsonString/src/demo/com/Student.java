package demo.com;

public class Student {
	private String name;
	private String age;
	private String subject;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Student(String name, String age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public Student() {};
}
