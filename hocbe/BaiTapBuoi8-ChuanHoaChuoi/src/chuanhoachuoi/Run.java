package chuanhoachuoi;

public class Run {

	public static void main(String[] args) {
		String name = " le    vAn     LuYen    ";
		
		String nameLowerCase = name.toLowerCase();
		
		String chuoi1 = nameLowerCase.substring(0, 3);
		String chuoi2 = nameLowerCase.substring(7, 11);
		String chuoi3 = nameLowerCase.substring(15, name.length());
		
		String kyTu1 = chuoi1.substring(0, 2);
		String phanConLaiKyTu1 = chuoi1.substring(2, 3);
		String kyTu2 = chuoi2.substring(0, 1);
		String phanConLaiKyTu2 = chuoi2.substring(1, 3);
		String kyTu3 = chuoi3.substring(0, 1);
		String phanConLaiKyTu3 = chuoi3.substring(1, 5);
		
		kyTu1 = kyTu1.toUpperCase();
		kyTu2 = kyTu2.toUpperCase();
		kyTu3 = kyTu3.toUpperCase(); 
		
		String tuThuNhat = kyTu1.concat(phanConLaiKyTu1);
		String tuThuHai = kyTu2.concat(phanConLaiKyTu2);
		String tuThuBa = kyTu3.concat(phanConLaiKyTu3);
		
		name = tuThuNhat +" "+ tuThuHai +" "+ tuThuBa;
		
		System.out.println(name.trim());

	}

}
