package tinhtienmotchuyenbay;

import java.util.Scanner;

public class KhachHang {
	private String hoTen;
	private String gioiTinh;
	private String soLuongVe;


	public KhachHang() {
		super();
	}

	public KhachHang(String hoTen, String gioiTinh, String soLuongVe) {
		super();
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.soLuongVe = soLuongVe;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoLuongVe() {
		return soLuongVe;
	}

	public void setSoLuongVe(String soLuongVe) {
		this.soLuongVe = soLuongVe;
	}

	public void nhapThongTinKhachHang() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		hoTen = scanner.nextLine();

		System.out.println("Nhập giới tính: ");
		gioiTinh = scanner.nextLine();

		System.out.println("Nhập số lượng vé: ");
		soLuongVe = scanner.nextLine();

	}

	public void hienThongTinKhachHang() {
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("Giới tính: " + gioiTinh);
		System.out.println("Số lượng vé: " + soLuongVe);

	}

}
