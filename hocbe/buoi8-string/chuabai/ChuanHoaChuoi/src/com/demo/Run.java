package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap ten:");
		String ten = scan.nextLine();
		
		String[] mangTen = ten.split("\s{1,}|\t{1,}");
		
		List<String> mangTenSauXuLy = new ArrayList<String>(); 
		for(int i = 0; i < mangTen.length; i++) {
			if(!mangTen[i].isEmpty()) {
				mangTenSauXuLy.add(mangTen[i]);
			}
		}
		
		String ketQua = "";
		for(String item : mangTenSauXuLy) {
			String kyTuDau = item.substring(0, 1);
			String phanConlai = item.substring(1, item.length());
			ketQua += kyTuDau.toUpperCase() + phanConlai.toLowerCase() + " ";
		}
		ketQua = ketQua.trim();
		System.out.println(ketQua);
	}

}
