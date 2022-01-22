package phucvukhachdennganhang;

import java.util.Scanner;

public class KhachHang {
	private String ten;
	private int cmnd;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public KhachHang(String ten, int cmnd) {
		super();
		this.ten = ten;
		this.cmnd = cmnd;
	}
	public void setGiaTriKhach() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=== Them thong tin khach hang ===");
		try {
			System.out.print("Nhap ten: ");
			ten = scanner.nextLine();
			System.out.print("Nhap cmnd: ");
			cmnd = Integer.valueOf(scanner.nextLine());
			
		} catch (Exception e) {
			System.out.println("Thong tin nhap sai");
		}
		
		System.out.println("=== Thong tin vua them ===");
		System.out.println("Ten: " + ten);
		System.out.println("CMND: " + cmnd);
	}
	public KhachHang() {
		
	}

	
	
	
}
