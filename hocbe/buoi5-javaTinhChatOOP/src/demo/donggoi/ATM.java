package demo.donggoi;

public class ATM {

	private int soDu;
	private int soThe;
	private String maSo;
	
	//Get va Set
	public int getSoDu() {
		return soDu;
	}
	
	public void setSoDu(int soDu) {
		this.soDu = soDu;
	}
	
	public int getSoThe() {
		return soThe;
	}
	
	public void setSoThe(int soThe) {
		this.soThe = soThe;
	}
	
	public String getMaSo() {
		return maSo;
	}
	
	public void setMaSo(String maSo) {
		this.maSo = "NGAN" + "HANG-" + maSo;
	}
}
