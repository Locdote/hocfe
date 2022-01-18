package demo.quanlyxe;

import java.util.Scanner;

public class DanhSachXe {
	private int maXe;
	private String tenXe;
	private int giaXe;
	private String mauXe;

	public int getMaXe() {
		return maXe;
	}

	public void setMaXe(int maXe) {
		this.maXe = maXe;
	}

	public String getTenXe() {
		return tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public int getGiaXe() {
		return giaXe;
	}

	public void setGiaXe(int giaXe) {
		this.giaXe = giaXe;
	}

	public String getMauXe() {
		return mauXe;
	}

	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}

	public DanhSachXe(int maXe, String tenXe, int giaXe, String mauXe) {
		super();
		this.maXe = maXe;
		this.tenXe = tenXe;
		this.giaXe = giaXe;
		this.mauXe = mauXe;
	}
	
	public DanhSachXe() {
		// TODO Auto-generated constructor stub
	}

	public void themXe() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma xe: ");
		maXe = Integer.valueOf(scanner.nextLine());
		System.out.println("Nhap ten xe: ");
		tenXe = scanner.nextLine();
		System.out.println("Nhap gia xe: ");
		giaXe = Integer.valueOf(scanner.nextLine());
		System.out.println("Nhap mau xe: ");
		mauXe = scanner.nextLine();
		System.out.println("=== Xe vua them ===");
		System.out.println("Ma xe: " + maXe + " = Ten xe: " + tenXe + " = Gia xe: " + giaXe + " = Mau xe: " + mauXe);
		System.out.println("===================");
	}
}
