package phucvukhachdennganhang;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Queue<KhachHang> danhSachKhachHang = new LinkedList<KhachHang>();

		Scanner scan = new Scanner(System.in);
		int input = 10;
		while (input != 0) {
			System.out.println("1 Ban La Khach Hang");
			System.out.println("2 Ban La Nhan Vien");
			input = scan.nextInt();
			if (input == 1) {
				KhachHang danhSachKhach = new KhachHang();
				danhSachKhach.setGiaTriKhach();
				danhSachKhachHang.add(danhSachKhach);
			} else if (input == 2) {
				System.out.println("1 Phuc Vu Khach Hang");
				input = scan.nextInt();
				for (int i = 0; i < danhSachKhachHang.size(); i++) {
					KhachHang khachDenTruoc = danhSachKhachHang.poll();
					System.out.println(khachDenTruoc.getTen());
				}

			}

		}

	}
}
