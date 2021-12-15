package demo.truutuong;

public class HocSinh extends ConNguoi implements HocTap{
	private String mat;
	private String cap;
	@Override
	public void di() {
		// TODO Auto-generated method stub
		//super goi class cha
		super.thucHienDi();
	}
	@Override
	public void docSach() {
		// TODO Auto-generated method stub
		// this dang goi chinh ban than object
		this.mat = " 2 mat";
		this.thi();
	}
	@Override
	public void lamBaiTap() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void thi() {
		// TODO Auto-generated method stub
		
	}
	
}
