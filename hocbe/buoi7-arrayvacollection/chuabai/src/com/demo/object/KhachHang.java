package com.demo.object;

import java.util.Scanner;

public class KhachHang {

	private String ten;
	private int tuoi;
	private String gioiTinh;
	private Ve ve;
	private int soVe;
	private int tienPhaiTra;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getSoVe() {
		return soVe;
	}

	public void setSoVe(int soVe) {
		this.soVe = soVe;
	}

	public int getTienPhaiTra() {
		return tienPhaiTra;
	}

	public void setTienPhaiTra(int tienPhaiTra) {
		this.tienPhaiTra = tienPhaiTra;
	}

	public Ve getVe() {
		return ve;
	}

	public void setVe(Ve ve) {
		this.ve = ve;
	}

	public KhachHang(String ten, int tuoi, String gioiTinh, int soVe, int tienPhaiTra) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.soVe = soVe;
		this.tienPhaiTra = tienPhaiTra;
	}

	public KhachHang() {	};
	
	public void nhapThongTin() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ten khach:");
		String ten = scan.nextLine();
		this.ten = ten;
		
		System.out.println("Nhap tuoi khach:");
		int tuoi = scan.nextInt();
		this.tuoi = tuoi;
		
		System.out.println("Nhap gioi tinh khach:");
		scan.next();
		String gioiTinh = scan.nextLine();
		this.gioiTinh = gioiTinh;
		
		System.out.println("Nhap loaiVe:");
		String loaiVe = scan.nextLine();
		this.ve = Ve.layVeTheoLoai(loaiVe);
		
		System.out.println("Nhap so ve khach mua:");
		int soVe = scan.nextInt();
		this.soVe = soVe;
	}
}
