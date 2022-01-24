package demo.com;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		File file1 = new File("D:\\loc\\hocfe\\hocbe\\buoi10-docghifile\\docghifile\\resource\\demo.txt");
		System.out.println("file1 thuc thi duoc khong: " + file1.canExecute());
		System.out.println("file1 thuc doc duoc khong: " + file1.canRead());
		System.out.println("file1 thuc ghi duoc khong: " + file1.canWrite());
		
		file1.setExecutable(false);
		System.out.println("file1 thuc thi duoc khong: " + file1.canExecute());
		
		File file2 = new File("D:\\loc\\hocfe\\hocbe\\buoi10-docghifile\\docghifile\\resource\\demo2.txt");
		try {
			// Tao file moi
			file2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File dir1 = new File("D:\\loc\\hocfe\\hocbe\\buoi10-docghifile\\docghifile\\resource\\demo");
		// tao thu muc moi
		dir1.mkdir();
		
		File file3 = new File("D:\\dsdsd");
		System.out.println("file2 co ton tai khong: " + file2.exists());
		System.out.println("file3 co ton tai khong: " + file3.exists());
		System.out.println("dir1 co phai thu muc khong: " + dir1.isDirectory());
		System.out.println("file2 co phai thu muc khong: " + file2.isDirectory());
		
		file2.delete();
		System.out.println("file2 co ton tai khong sau khi xoa: " + file2.exists());
		
		System.out.println("file1 duong dan tuyet doi: " + file1.getAbsolutePath());
		System.out.println("file1 duong dan tuong doi: " + file1.getPath());
		System.out.println("file1 lay ten file: " + file1.getName());
		
		file1.renameTo(new File("D:\\loc\\hocfe\\hocbe\\buoi10-docghifile\\docghifile\\resource\\demo-saukhidoiten.txt"));
		
		File dir2 = new File("D:\\loc\\hocfe\\hocbe\\buoi10-docghifile\\docghifile\\resource");
		File[] listFile = dir2.listFiles();
		for(File f : listFile) {
			System.out.println("File name: " + f.getName());
		}
	}

}
