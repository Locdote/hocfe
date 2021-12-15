package chuabai.object;

public class DienThoaiThongMinh extends ThietBiDienTu{
	
	public DienThoaiThongMinh(String manHinh, String heDieuHanh, String ram, String pin) {
		super(manHinh, heDieuHanh, ram, pin);
	}
	
	public DienThoaiThongMinh(String manHinh, String heDieuHanh, String ram, String pin, String cameraSau,
			String cameraTruoc, String theNho) {
		super(manHinh, heDieuHanh, ram, pin);
		this.cameraSau = cameraSau;
		this.cameraTruoc = cameraTruoc;
		this.theNho = theNho;
	}

	private String cameraSau;
	private String cameraTruoc;
	private String theNho;
	
	public String getCameraSau() {
		return cameraSau;
	}
	public void setCameraSau(String cameraSau) {
		this.cameraSau = cameraSau;
	}
	public String getCameraTruoc() {
		return cameraTruoc;
	}
	public void setCameraTruoc(String cameraTruoc) {
		this.cameraTruoc = cameraTruoc;
	}
	public String getTheNho() {
		return theNho;
	}
	public void setTheNho(String theNho) {
		this.theNho = theNho;
	}
	
	@Override
	public String toString() {
		return "DienThoaiThongMinh [cameraSau=" + cameraSau + ", cameraTruoc=" + cameraTruoc + ", theNho=" + theNho
				+ ", manHinh=" + manHinh + ", heDieuHanh=" + heDieuHanh + ", ram=" + ram + ", pin=" + pin + "]";
	}
}
