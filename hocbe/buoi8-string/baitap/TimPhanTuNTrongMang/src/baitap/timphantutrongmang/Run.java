package baitap.timphantutrongmang;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		int[] soNguyen = { 5, 89, 55, 182, 54, 44, 154 };// 7
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập n: ");
		n = scanner.nextInt();
		for (int i = 0; i < soNguyen.length; i++) { // i=0; i=1; i=2
			for (int x = i + 1; x < soNguyen.length; x++) {// x=1;x=2;x=3;
				if (soNguyen[i] < soNguyen[x]) {// 5<89;55<182;
					int z = soNguyen[i];
					soNguyen[i] = soNguyen[x];
					soNguyen[x] = z;// z=89;
					
				}
			}
		}
			System.out.println(soNguyen[n]);
	}

}
