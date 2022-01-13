package demo.com;

public class Run {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		ChuyenHoa chuyenHoa = new ChuyenHoa();
		Student student = new Student("Nguyen Van A", "10", "Toan");
		String ketQua = chuyenHoa.chuyenHoaSangJsonString(student);
		System.out.println(ketQua);
	}

}
