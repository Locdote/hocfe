package demo.doituong.giaipt;

public class PtBacNhat {

	public int y;
	public int a;
	public int b;
	
	public int timX() {
		int ketQua = (y - b)/a;
		return ketQua;
	}
	
	public void inTimX() {
		int ketQua = (y - b)/a;
		System.out.println("Ket qua inTimX: " + ketQua);
	}
}
