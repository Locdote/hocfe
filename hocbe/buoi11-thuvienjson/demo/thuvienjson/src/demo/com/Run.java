package demo.com;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

public class Run {

	public static void main(String[] args) {
		Student student = new Student("1001", "Nguyen Van B", "18");
		String studentStr = "{\"id\":\"1002\",\"name\":\"Nguyen Van A\",\"age\":\"22\"}";
		
		// Demo gson
		Gson gson = new Gson();
		String studentGsonStr = gson.toJson(student);
		System.out.println("Gson object to string: " + studentGsonStr);
		
		Student studentGsonObject = gson.fromJson(studentStr, Student.class);
		System.out.println("Gson string to object: " + studentGsonObject.toString());
		
		
		// Fastjson
		String fastJsonStr = JSON.toJSONString(student);
		System.out.println("Fastjson object to string: " + fastJsonStr);
		
		Student fastJsonObject = JSON.parseObject(studentStr, Student.class);
		System.out.println("Fastjson string to object: " + fastJsonObject);
		
	}

}
