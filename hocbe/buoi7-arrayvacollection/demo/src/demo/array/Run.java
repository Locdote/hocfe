package demo.array;

public class Run {

	public static void main(String[] args) {
		String[] danhSachTen = {"Nguyen Van A", "Nguyen Van B", "Nguyen Van C"};
		int danhSachTuoi[] = {1, 2, 3, 4};
		HocSinh[] danhSachHocSinh = new HocSinh[3];
		
		System.out.println("Ten hoc sinh thu 0: " + danhSachTen[0]);
		System.out.println("Danh sach hoc sinh thu 0: " + danhSachHocSinh[0]);
		
		for(int i = 0; i < danhSachTuoi.length; i++) {
			System.out.println("Danh sach tuoi thu " + i + ": " + danhSachTuoi[i]);
		}
	}

}

class HocSinh {
	private String ten;
	private String tuoi;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	
}
