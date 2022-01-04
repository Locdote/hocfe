package com.demo.object;

public class Ve {

	public static Ve veCaoCap = new Ve("Cao cap", 10000);
	public static Ve veThuongGia = new Ve("Thuong gia", 5000);
	public static Ve veTrungCap = new Ve("Trung cap", 2000);
	
	private String loai;
	private int gia;

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public Ve(String loai, int gia) {
		super();
		this.loai = loai;
		this.gia = gia;
	}
	
	public Ve() {}
	
	public static Ve layVeTheoLoai(String loaiVe) {
		if (loaiVe.equals("Cao cap"))
			return veCaoCap;
		if (loaiVe.equals("Thuong gia"))
			return veThuongGia;
		if (loaiVe.equals("Trung cap"))
			return veTrungCap;
		return new Ve();
	}
}
