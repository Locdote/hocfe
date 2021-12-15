package chuabai.object;

public class Laptop extends ThietBiDienTu{
	public Laptop(String manHinh, String heDieuHanh, String ram, String pin) {
		super(manHinh, heDieuHanh, ram, pin);
	}

	public Laptop(String manHinh, String heDieuHanh, String ram, String pin, String chip, String oCung,
			String chipDoHoa) {
		super(manHinh, heDieuHanh, ram, pin);
		this.chip = chip;
		this.oCung = oCung;
		this.chipDoHoa = chipDoHoa;
	}

	private String chip;
	private String oCung;
	private String chipDoHoa;
	
	public String getChip() {
		return chip;
	}
	public void setChip(String chip) {
		this.chip = chip;
	}
	public String getoCung() {
		return oCung;
	}
	public void setoCung(String oCung) {
		this.oCung = oCung;
	}
	public String getChipDoHoa() {
		return chipDoHoa;
	}
	public void setChipDoHoa(String chipDoHoa) {
		this.chipDoHoa = chipDoHoa;
	}
	
	@Override
	public String toString() {
		return "Laptop [chip=" + chip + ", oCung=" + oCung + ", chipDoHoa=" + chipDoHoa + ", manHinh=" + manHinh
				+ ", heDieuHanh=" + heDieuHanh + ", ram=" + ram + ", pin=" + pin + "]";
	}
	
	
}
