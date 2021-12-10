package demo.kethua;

public class Run {

	public static void main(String[] args) {
		SinhVien sinhVien = new SinhVien();
		
		sinhVien.setMui("2 lo mui");
		System.out.println(sinhVien.getMui());
		
		sinhVien.anUong();
		
		GiaoVien giaoVien = new GiaoVien();
		giaoVien.anUong();
	}

}
