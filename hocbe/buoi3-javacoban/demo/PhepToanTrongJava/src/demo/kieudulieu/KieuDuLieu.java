package demo.kieudulieu;

import java.io.IOException;

public class KieuDuLieu {

	// Bien toan cuc
	// Duoc truy cap o bat ky dau trong class
	public String studentName = "Nguyen Van B";
	
	// Bien static
	// La bien duoc khoi tao gia tri ngay lap tuc khi chuong trinh chay len
	public static String address = "So 11";
	
	// Bien final (constant)
	// Bien khong the bi thay doi gia tri
	public static final String classes = "Lop 10"; 
	
	public static void main(String[] args) throws IOException {
		// Bien cuc bo
		// Chi duoc truy cap o trong khoi {}
		// Khong duoc phep su dung public, private, protected
		String name = "Nguyen Van A";
		name = "Nguyen Van C";
	}
	//name = "dsdsd"; loi~ vi name duoc goi o ngoai ham main 
}
