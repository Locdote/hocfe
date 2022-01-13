package demo.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {

	public static void main(String[] args) {
		Set<String> danhSachHocSinh = new HashSet<String>();
		danhSachHocSinh.add("Nguyen Van A");
		danhSachHocSinh.add("Nguyen Van A");
		danhSachHocSinh.add("Nguyen Van B");
		danhSachHocSinh.add("Nguyen Van C");
		danhSachHocSinh.add("Nguyen Van D");
		
		
		danhSachHocSinh.remove("Nguyen Van B");
		danhSachHocSinh.remove("========================");
		
		Iterator iterator = danhSachHocSinh.iterator();
		while(iterator.hasNext()) {
			String hocSinh = (String) iterator.next();
			System.out.println(hocSinh);
		}
	}

}
