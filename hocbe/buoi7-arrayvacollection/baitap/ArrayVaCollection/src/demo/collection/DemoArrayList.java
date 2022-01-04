package demo.collection;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		List<String> danhSachTen = new ArrayList<String>();
		
		// ham them phan tu
		danhSachTen.add("Nguyen Van A");
		danhSachTen.add("Nguyen Van B");
		danhSachTen.add("Nguyen Van C");
		danhSachTen.add("Nguyen Van D");
		//lay do dai list
		int doDai = danhSachTen.size();
		System.out.println("do dai cua danh sach ten:"+ doDai);
		
		//lay ra phan tu
		String ten = danhSachTen.get(1);
		System.out.println("phan tu thu 1:" + ten);
		
		// ham xoa 1 phan tu array
		danhSachTen.remove(3);
		// goi lai bien va gan gia tri moi
		doDai = danhSachTen.size();
		System.out.println("do dai danhSachTen " + doDai);
		
		for(int i = 0; i< danhSachTen.size(); i++) {
			System.out.println("ten thu : " + i + danhSachTen.get(i));
		}
		for(String name : danhSachTen) {
			System.out.println("ten thu : " + name);
		}
		
	}

}
