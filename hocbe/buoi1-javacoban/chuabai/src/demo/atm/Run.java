package demo.atm;

import java.util.Scanner;

import demo.atm.object.ATM;
import demo.atm.object.TheATM;

public class Run {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Scanner scan = new Scanner(System.in);
		
		TheATM theATM = new TheATM();
		
		System.out.print("Nhap so the: ");
		theATM.soThe = scan.nextLine();
		
		System.out.print("Nhap ma so: ");
		theATM.matKhau = scan.nextLine();
		
//		System.out.println(theATM.soThe);
//		System.out.println(theATM.matKhau);
//		
		if(atm.kiemTraTheAtm(theATM)) {
			System.out.print("Nhap so tien can rut: ");
			int soTienRut = scan.nextInt();
			atm.rutTien(soTienRut);
		} else {
			System.out.println("So the va mat khau sai!");
		}
		
	}

}
