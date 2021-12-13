package demo.truutuong;

public class HocSinh extends ConNguoi implements HocTap {

	private String mat;
	private String caiCap;
	
	@Override
	public void di() {
		// supper la goi class cha
		super.thucHienDi();
	}

	@Override
	public void docSach() {
		// TODO Auto-generated method stub
		// this la dang goi chinh ban than object
		this.mat = "2 mat";
		this.thiCu();
		
		
	}

	@Override
	public void lamBaiTap() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void thiCu() {
		// TODO Auto-generated method stub
		
	}
}
