package demo.dahinh;


public class NauCom extends LamBep {

	//Overriding
	@Override
	public void nauAn() {
		System.out.println("NauCom dang nau an");
	}
	
	
	//Overloading
	// Mot object co the co nhieu phuong thuc cung ten, nhung khac so parameter hoac parameter khac kieu du lieu
	public void voGao(String loaiGao) {
		System.out.println("Vo gao cach 1");
	}
	
	public void voGao(String loaiGao, int soLuong) {
		System.out.println("Vo gao cach 2");
	}
	
	public void voGao(String loaiGao, String soLuong) {
		System.out.println("Vo gao cach 3");

	}
}
