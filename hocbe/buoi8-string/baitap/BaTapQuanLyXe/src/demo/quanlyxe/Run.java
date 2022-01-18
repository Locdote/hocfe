package demo.quanlyxe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		List<DanhSachXe> DanhSachXe = new ArrayList<DanhSachXe>();

		DanhSachXe xe1 = new DanhSachXe(101, "Xe A", 5000, "Xanh");
		DanhSachXe.add(xe1);
		DanhSachXe xe2 = new DanhSachXe(102, "Xe B", 2000, "Cam");
		DanhSachXe.add(xe2);
		DanhSachXe xe3 = new DanhSachXe(103, "Xe C", 4000, "Vang");
		DanhSachXe.add(xe3);
		Scanner scan = new Scanner(System.in);
		int input = 10;
		while (input != 0) {
			System.out.println("1 Thêm xe mới");
			System.out.println("2 Hiện danh sách xe");
			System.out.println("3 Tim theo mã xe");
			System.out.println("0 Kết thúc");
			input = scan.nextInt();

			if (input == 1) {
				System.out.println("=== Nhap thong tin xe ===");
				DanhSachXe danhSachXe = new DanhSachXe();
				danhSachXe.themXe();
				DanhSachXe.add(danhSachXe);
			} else if (input == 2) {
				System.out.println("=== Danh Sach Xe ===");
				for (int i = 0; i < DanhSachXe.size(); i++) {
					System.out.println("Ma xe: " + DanhSachXe.get(i).getMaXe() + " = Ten xe: "
							+ DanhSachXe.get(i).getTenXe() + " = Gia xe: " + DanhSachXe.get(i).getGiaXe()
							+ " = Mau xe: " + DanhSachXe.get(i).getMauXe());
				}
				System.out.println("=====================");
			} else if (input == 3) {
				System.out.println("=== Nhap ma xe ===");
				input = scan.nextInt();
				for (int i = 0; i < DanhSachXe.size(); i++) {
					if (input == DanhSachXe.get(i).getMaXe()) {
						System.out.println("Ma xe: " + DanhSachXe.get(i).getMaXe() + " = Ten xe: "
								+ DanhSachXe.get(i).getTenXe() + " = Gia xe: " + DanhSachXe.get(i).getGiaXe()
								+ " = Mau xe: " + DanhSachXe.get(i).getMauXe());
					}
				}
				System.out.println("=====================");
			}
		}
	}
}
