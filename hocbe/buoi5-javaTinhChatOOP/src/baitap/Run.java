package baitap;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		DienThoaiThongMinh DienThoaiThongMinh = new DienThoaiThongMinh();
		System.out.println("chon 1 de xem thong tin dien thoai");
		System.out.println("chon 2 de xem thong tin laptop");
		System.out.println("chon 0 de ket thuc");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a == 1) {
			System.out.println("Thong tin dien thoai" + DienThoaiThongMinh);
			System.out.println("Nhap 0 de quay lai");
		}else if(a == 2) {
			System.out.println("Thong tin laptop" + DienThoaiThongMinh);
			System.out.println("Nhap 0 de quay lai");
		}else if(a == 0) {
			
			
		}

	}

}
