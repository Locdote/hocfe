package demo.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		Map<Integer, String> danhSachHocSinh = new HashMap<Integer, String>();
		danhSachHocSinh.put(1, "Nguyen Van A");
		danhSachHocSinh.put(2, "Nguyen Van B");
		danhSachHocSinh.put(33, "Nguyen Van C");
		danhSachHocSinh.put(4, "Nguyen Van D");

		Set<Entry<Integer, String>> entry = danhSachHocSinh.entrySet();
//		for(Entry<Integer, String> e : entry) {
//			System.out.println(e.getKey() + ": " + e.getValue());
//		}

//		Iterator iterator = entry.iterator();
//		while(iterator.hasNext()) {
//			Entry<Integer, String> e = (Entry<Integer, String>) iterator.next();
//			System.out.println(e.getKey() + ": " + e.getValue());
//		}

		String hocSinhSo2 = danhSachHocSinh.get(2);
		System.out.println(hocSinhSo2);
		
		danhSachHocSinh.remove(33);
		for (Entry<Integer, String> e : entry) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}

}
