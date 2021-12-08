package demo.doituong.giaipt;

// Khai bao muon dung class nao, tu package nao
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		PtBacNhat ptBacNhat = new PtBacNhat();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap y:");
		int y = scan.nextInt();
		
		System.out.print("Nhap a:");
		int a = scan.nextInt();
		
		System.out.print("Nhap b:");
		int b = scan.nextInt();
		
		ptBacNhat.a = a;
		ptBacNhat.b = b;
		ptBacNhat.y = y;
		
		int ketQua = ptBacNhat.timX();
		System.out.println("timX: " + ketQua);
		
		ptBacNhat.inTimX();
	}
}
