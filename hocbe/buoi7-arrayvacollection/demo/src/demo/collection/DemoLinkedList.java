package demo.collection;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

	public static void main(String[] args) {
		List<String> danhSachTen = new LinkedList<>();

		// Ham them phan tu
		danhSachTen.add("Nguyen Van A");
		danhSachTen.add("Nguyen Van B");
		danhSachTen.add("Nguyen Van C");
		danhSachTen.add("Nguyen Van D");

		// Lay do dai list
		int doDai = danhSachTen.size();
		System.out.println("Do dai danhSachTen: " + doDai);

		// Lay ra mot phan tu
		String ten = danhSachTen.get(1);
		System.out.println("danhSachTen phan tu thu 1: " + ten);

		// Xoa mot phan tu
		danhSachTen.remove(3);
		doDai = danhSachTen.size();
		System.out.println("Do dai danhSachTen: " + doDai);

		for (int i = 0; i < danhSachTen.size(); i++) {
			System.out.println("Ten thu " + i + ": " + danhSachTen.get(i));
		}

		for (String name : danhSachTen) {
			System.out.println(name);
		}
	}

}
