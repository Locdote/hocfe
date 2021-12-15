package chuabai.object;

public class ThietBiDienTu {
	protected String manHinh;
	protected String heDieuHanh;
	protected String ram;
	protected String pin;
	
	public String getManHinh() {
		return manHinh;
	}
	public void setManHinh(String manHinh) {
		this.manHinh = manHinh;
	}
	public String getHeDieuHanh() {
		return heDieuHanh;
	}
	public void setHeDieuHanh(String heDieuHanh) {
		this.heDieuHanh = heDieuHanh;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public ThietBiDienTu(String manHinh, String heDieuHanh, String ram, String pin) {
		super();
		this.manHinh = manHinh;
		this.heDieuHanh = heDieuHanh;
		this.ram = ram;
		this.pin = pin;
	}
	
	public ThietBiDienTu() {
		
	};
}
