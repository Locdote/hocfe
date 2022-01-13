package demo.com;

import java.lang.reflect.Field;

public class ChuyenHoa {

	public String chuyenHoaSangJsonString(Student student) throws IllegalArgumentException, IllegalAccessException {
		StringBuffer result = new StringBuffer("");
		result.append("{");
		
		Field[] listFields = Student.class.getDeclaredFields();
		for(Field f : listFields) {
			f.setAccessible(true);
//			System.out.println(f.getName() + ": " + f.get(student).toString());
			result.append("\"" + f.getName()  + "\":" + "\"" + f.get(student).toString() + "\",");
		}
		result.deleteCharAt(result.length() - 1);
		
		result.append("}");
		return result.toString();
	}
}