package demo.com;

import java.util.Scanner;

public class XeOTo {

	private int maXe;
	private String tenXe;
	private int giaXe;
	
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
	public XeOTo(int maXe, String tenXe, int giaXe) {
		super();
		this.maXe = maXe;
		this.tenXe = tenXe;
		this.giaXe = giaXe;
	}
	public XeOTo() {}
	
	public void setGiaTriXe() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma xe: ");
		
		try {
			maXe = Integer.valueOf(scanner.nextLine());
			System.out.println("Nhap ten xe: ");
			tenXe = scanner.nextLine();
			System.out.println("Nhap gia xe: ");
			giaXe = Integer.valueOf(scanner.nextLine());
		} catch(NumberFormatException | NullPointerException ex) {
			System.out.println("co loi xay ra khi nhap maXe: " + ex.getMessage());
		} catch(Exception ex) {
			System.out.println("co loi xay ra khi nhap maXe");
			System.out.println("co loi xay ra khi nhap maXe");
		}
		System.out.println("=== Xe vua them ===");
		System.out.println(toString());
		System.out.println("===================");
	}

	@Override
	public String toString() {
		return "DanhSachXe [maXe=" + maXe + ", tenXe=" + tenXe + ", giaXe=" + giaXe + "]";
	}
	
}
