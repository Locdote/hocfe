package demo.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Run {

	public static void main(String[] args) {
//		XeOTo xeOTo = new XeOTo();
//		xeOTo.setGiaTriXe();
		xe.setGiaTriXe();
		docFile("");
		try {
			docFile1("");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			docFile2(null);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void docFile(String name) {
		File file = new File("C:/sdasd");
		try {
			FileInputStream fileIn = new FileInputStream(file);
			InputStreamReader in = new InputStreamReader(fileIn);
		} catch (FileNotFoundException eex) {
			System.out.println("Loi xay ra khi doc file");
		}
		
	}
	
	public static void docFile1(String name) throws FileNotFoundException {
		File file = new File("C:/sdasd");
		FileInputStream fileIn = new FileInputStream(file);
		InputStreamReader in = new InputStreamReader(fileIn);
	}
	public static XeOTo xe = new XeOTo();
	public static void docFile2(String name) {
		
		if (name == null) {
			throw new NullPointerException("Bi null");
		}
	}

}
