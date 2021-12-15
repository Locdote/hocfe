package demo.dahinh;

public class NauCom extends LamBep{
	//overriding
	@Override
	public void nauAn() {
		System.out.println("dang nau an");
	}
	//overloading
	//1 object co the co nhieu phuong thuc cung ten nhung khac parameter va khac kieu du lieu
	public void voGao(String loaiGao) {
		System.out.println("vo gao cach 1");
	}
	public void voGao(String loaiGao, int soLuong) {
		System.out.println("vo gao cach 2");
	}
	public void voGao(String loaiGao, String soLuong) {
		System.out.println("vo gao cach 3");
	}
}
