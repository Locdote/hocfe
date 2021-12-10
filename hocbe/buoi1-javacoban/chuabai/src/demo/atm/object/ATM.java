package demo.atm.object;

public class ATM {
	public int soDu = 1000000;
	public String soThe = "000111";
	public String matKhau = "123";
	
	public void rutTien(int soTienRut) {
		this.soDu = this.soDu - soTienRut;
		System.out.println("So tien con lai: " + this.soDu);
		System.out.println("Cam on da rut tien");
	}
	
	public boolean kiemTraTheAtm(TheATM theATM) {
		if (this.soThe.equals(theATM.soThe) && this.matKhau.equals(theATM.matKhau)) {
			return true;
		}
		return false;
	}
	
	
}
