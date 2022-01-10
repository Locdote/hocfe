package com.demo.object;

import java.util.List;

public class ChuyenBay {
	private List<Ve> danhSachVe;
	private String tenChuyenBay;
	private int thoiGianBay;
	private List<KhachHang> danhSachKhach;

	public List<Ve> getDanhSachVe() {
		return danhSachVe;
	}

	public void setDanhSachVe(List<Ve> danhSachVe) {
		this.danhSachVe = danhSachVe;
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

	public List<KhachHang> getDanhSachKhach() {
		return danhSachKhach;
	}

	public void setDanhSachKhach(List<KhachHang> danhSachKhach) {
		this.danhSachKhach = danhSachKhach;
	}

	public ChuyenBay(List<Ve> danhSachVe, String tenChuyenBay, int thoiGianBay, List<KhachHang> danhSachKhach) {
		super();
		this.danhSachVe = danhSachVe;
		this.tenChuyenBay = tenChuyenBay;
		this.thoiGianBay = thoiGianBay;
		this.danhSachKhach = danhSachKhach;
	}

	public void themKhachHang() {
		KhachHang khachHang = new KhachHang();
		khachHang.nhapThongTin();
		
		int tienKhachTra = tinhTienKhachTra(khachHang.getVe(), khachHang.getTuoi(), khachHang.getSoVe());
		khachHang.setTienPhaiTra(tienKhachTra);
		danhSachKhach.add(khachHang);
	}

	private int tinhTienKhachTra(Ve ve, int tuoi, int soVe) {
		int soTienGiam = 0;
		if (ve.getLoai().equals("Trung cap") && tuoi < 6) {
			soTienGiam += ve.getGia() * 20 / 100;
		}
		if ((20 <= thoiGianBay && thoiGianBay <= 24) || (1 <= thoiGianBay && thoiGianBay <= 4)) {
			soTienGiam += ve.getGia() * 50 / 100;
		}
		return (ve.getGia() - soTienGiam) * soVe;
	}
	
	public int tinhTongTien() {
		int ketQua = 0;
		for (int i = 0; i < danhSachKhach.size(); i++) {
			ketQua += danhSachKhach.get(i).getTienPhaiTra();
		}
		return ketQua;
	}
	
	public void inDanhSachKhach() {
		for (int i = 0; i < danhSachKhach.size(); i++) {
			KhachHang khach = danhSachKhach.get(i);
			System.out.println("\n=======================");
			System.out.println("Ten: " + khach.getTen());
			System.out.println("Tuoi: " + khach.getTuoi());
			System.out.println("Gioi tinh: " + khach.getGioiTinh());
			System.out.println("Ten chuyen bay: " + this.tenChuyenBay);
			System.out.println("Thoi gian bay: " + this.thoiGianBay);
			System.out.println("So ve khach mua: " + khach.getSoVe());
			System.out.println("Tien khach tra: " + khach.getTienPhaiTra());
		}
	}
}
