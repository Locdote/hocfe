package tinhtienmotchuyenbay;

import java.util.Scanner;

public class ChuyenBay {

	private String tenChuyenBay;
	private int thoiGianBay;
	private int tienVe;
	private int tuoi;
	private String loaiVe;
	private KhachHang khachHang;

	public ChuyenBay() {
		super();
	}

	public ChuyenBay(String tenChuyenBay, int thoiGianBay, int tienVe, int tuoi, String loaiVe, KhachHang khachHang) {
		super();
		this.tenChuyenBay = tenChuyenBay;
		this.thoiGianBay = thoiGianBay;
		this.tienVe = tienVe;
		this.tuoi = tuoi;
		this.loaiVe = loaiVe;
		this.khachHang = khachHang;
	}

	public String getTenChuyenBay() {
		return tenChuyenBay;
	}

	public void setTenChuyenBay(String tenChuyenBay) {
		this.tenChuyenBay = tenChuyenBay;
	}

	public int getThoiGianBay() {
		return thoiGianBay;
	}

	public void setThoiGianBay(int thoiGianBay) {
		this.thoiGianBay = thoiGianBay;
	}

	public int getTienVe() {
		return tienVe;
	}

	public void setTienVe(int tienVe) {
		this.tienVe = tienVe;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getLoaiVe() {
		return loaiVe;
	}

	public void setLoaiVe(String loaiVe) {
		this.loaiVe = loaiVe;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public void nhapThongTinQuanLy() {
		Scanner scanner = new Scanner(System.in);

		khachHang = new KhachHang();
		khachHang.nhapThongTinKhachHang();

		System.out.println("Nhập tên chuyến bay: ");
		tenChuyenBay = scanner.nextLine();

		System.out.println("Nhập thời gian bay: ");
		thoiGianBay = scanner.nextInt();

		System.out.println("Nhập tiền vé: ");
		tienVe = scanner.nextInt();

		System.out.println("Nhập tuổi: ");
		tuoi = scanner.nextInt();

	}

	public void hienThongTinQuanLy() {
		khachHang.hienThongTinKhachHang();
		System.out.println("Tuổi: " + tuoi);
		System.out.println("Tên chuyến bay: " + tenChuyenBay);
		System.out.println("Thời gian bay: " + thoiGianBay);
		System.out.println("Tiền vé: " + tienVe);

	}

	int veCaoCap = 10000;
	int veThuongGia = 5000;
	int veTrungCap = 2000;
	public int tongTienChuyenBay() {
		int ketQua1 = 0;
		int ketQua2 = 0;
		if (tuoi < 7 && Integer.parseInt(loaiVe) == veTrungCap) {
			int soTienGiam1 = (veTrungCap * 20) / 100;
			ketQua1 = veTrungCap - soTienGiam1;
		} else if (thoiGianBay >= 20 || thoiGianBay <= 4) {
			int soTienGiam2 = (tienVe * 50) / 100;
			ketQua2 = tienVe - soTienGiam2;
		}
	
		return ketQua1 + ketQua2;
	}
}
