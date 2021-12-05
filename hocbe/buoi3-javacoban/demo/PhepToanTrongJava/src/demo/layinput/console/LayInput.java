package demo.layinput.console;

import java.util.Scanner;

public class LayInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao gia tri a: ");
		int input1 = scan.nextInt();
		System.out.println("Nhap vao gia tri b: ");
		int input2 = scan.nextInt();
		
		System.out.println("input1: " + input1);
		System.out.println("input2: " + input2);
	}

}
