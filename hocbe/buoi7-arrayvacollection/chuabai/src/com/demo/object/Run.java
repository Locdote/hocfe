package com.demo.object;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		ChuyenBay chuyenBay = new ChuyenBay(new ArrayList<Ve>(), "Chuyen bay ABC", 1, new ArrayList<KhachHang>());

		Scanner scan = new Scanner(System.in);
		int input = 10;
		while (input != 0) {
			System.out.println("1. Them khach hang");
			System.out.println("2. In tong tien");
			System.out.println("3. In danh sach khach hang");
			System.out.println("0. Thoat");
			System.out.println("Nhap:");
			input = scan.nextInt();

			switch (input) {
			case 1: {
				chuyenBay.themKhachHang();
				break;
			}
			case 2: {
				int tongTien = chuyenBay.tinhTongTien();
				System.out.println("Tong tien: " + tongTien);
				break;
			}
			case 3: {
				chuyenBay.inDanhSachKhach();
				break;
			}
			default:

			}
		}
	}

}
