package chuabai.run;

import java.util.Scanner;

import chuabai.object.DienThoaiThongMinh;
import chuabai.object.Laptop;

public class Run {

	public static void main(String[] args) {
		// Khoi tao cac object cua cua hang
		Laptop laptop1 = new Laptop("Man hinh 1", "He dieu hanh 1", "Ram 1", "Pin 1", "Chip 1", "O cung 1", "Chip do hoa 1");
		Laptop laptop2 = new Laptop("Man hinh 2", "He dieu hanh 2", "Ram 2", "Pin 2", "Chip 2", "O cung 2", "Chip do hoa 2");
		Laptop laptop3 = new Laptop("Man hinh 3", "He dieu hanh 3", "Ram 3", "Pin 3", "Chip 3", "O cung 3", "Chip do hoa 3");
		
		DienThoaiThongMinh dienThoai1 = new DienThoaiThongMinh("Man hinh 1", "He dieu hanh 1", "Ram 1", "Pin 1", "Camerasau 1", "Cameratruoc 1", "The nho 1");
		DienThoaiThongMinh dienThoai2 = new DienThoaiThongMinh("Man hinh 2", "He dieu hanh 2", "Ram 2", "Pin 2", "Camerasau 2", "Cameratruoc 2", "The nho 2");
		DienThoaiThongMinh dienThoai3 = new DienThoaiThongMinh("Man hinh 3", "He dieu hanh 3", "Ram 3", "Pin 3", "Camerasau 3", "Cameratruoc 3", "The nho 3");
		
		
		Scanner scan = new Scanner(System.in);
		int input = 10;
		while(input != 0) {
			System.out.println("chon 1 de xem thong tin dien thoai");
			System.out.println("chon 2 de xem thong tin laptop");
			System.out.println("chon 0 de ket thuc");
			
			input = scan.nextInt();
			
			if (input == 1) {
				System.out.println("chon 1: xem laptop1");
				System.out.println("chon 2: xem laptop2");
				System.out.println("chon 3: xem laptop3");
				System.out.println("chon 0 de ket thuc");
				input = scan.nextInt();
				switch (input) {
				case 1:
					System.out.println(laptop1.toString());
					break;
				case 2:
					System.out.println(laptop2.toString());
					break;
				case 3:
					System.out.println(laptop3.toString());
					break;
				default:
					
				}
			} else if (input == 2) {
				System.out.println("chon 1: xem dienThoai1");
				System.out.println("chon 2: xem dienThoai2");
				System.out.println("chon 3: xem dienThoai3");
				System.out.println("chon 0 de ket thuc");
				input = scan.nextInt();
				switch (input) {
				case 1:
					System.out.println(dienThoai1.toString());
					break;
				case 2:
					System.out.println(dienThoai2.toString());
					break;
				case 3:
					System.out.println(dienThoai3.toString());
					break;
				default:
					
				}
			}
		}
	}
}
