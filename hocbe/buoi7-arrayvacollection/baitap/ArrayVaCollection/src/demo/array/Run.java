package demo.array;

public class Run {

	public static void main(String[] args) {
		String[] danhSachTen = {"Nguyen Van A", "Nguyen Van B", "Nguyen Van C"};
		int danhSachTuoi[] = {1 ,2 ,3, 4};
		HocSinh[] danhSachHocSinh = new HocSinh[3];
		System.out.println("Ten hoc sinh thu 1 " + danhSachTen[1]);
		System.out.println("Ten hoc sinh thu 1 " + danhSachHocSinh[1]);
		
		for(int i=0; i < danhSachTuoi.length; i++ ) {
			System.out.println("danh sach tuoi: " + danhSachTuoi[i]);
		}
	}

}
class HocSinh{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	private String tuoi;
}