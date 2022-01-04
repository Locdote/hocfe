package tinhtienmotchuyenbay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 1;
		ChuyenBay chuyenBay;

		ArrayList<ChuyenBay> arrChuyenBay = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			chuyenBay = new ChuyenBay();
			System.out.println("Nhập thông tin khách hàng: ");
			chuyenBay.nhapThongTinQuanLy();
			arrChuyenBay.add(chuyenBay);
		}
		for (int i = 0; i < arrChuyenBay.size(); i++) {
			System.out.println("Thông tin khách hàng: ");
			arrChuyenBay.get(i).hienThongTinQuanLy();
		}
		
		for(int i = 0; i < arrChuyenBay.size(); i++) {
			System.out.println("tong tien chuyen bay: " + arrChuyenBay.get(i).tongTienChuyenBay());
		}

	}

}
