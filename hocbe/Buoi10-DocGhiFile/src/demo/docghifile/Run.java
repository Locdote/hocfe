package demo.docghifile;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		File file1 = new File("D:\\eclipse-workspace\\Buoi10-DocGhiFile\\Resource\\demo.txt");
		System.out.println("File thuc thi duoc khong :"+ file1.canExecute());
		System.out.println("File doc duoc khong :"+ file1.canRead());
		System.out.println("File ghi duoc khong :"+ file1.canWrite());
		
		file1.setExecutable(false);
		System.out.println("File thuc thi duoc khong :"+ file1.canExecute());
		
		File file2 = new File("D:\\eclipse-workspace\\Buoi10-DocGhiFile\\Resource\\demo2.txt");
		try {
//			Tao file moi
			file2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File dir1 = new File("D:\\eclipse-workspace\\Buoi10-DocGhiFile\\Resource\\demo");
//		Tao thu muc moi
		dir1.mkdir();
		
		File file3 = new File("sd:dsdas");
		System.out.println("File 2 co ton tai khong :" + file2.exists());
		System.out.println("File 3 co ton tai khong :" + file3.exists());
		System.out.println("File dir1 co phai thu muc khong :" + dir1.isDirectory());
		System.out.println("File dir1 co phai thu muc khong :" + dir1.isFile());
		
		file2.delete();
		System.out.println("File 2 co ton tai khong sau khi xoa :" + file2.exists());
		
		System.out.println("file1 duong dan tuyet doi :"+ file1.getAbsolutePath());
		System.out.println("file1 duong dan tuong doi :"+ file1.getPath());
		System.out.println("file1 lay ten file :"+ file1.getName());
		
		file1.renameTo(new File("D:\\eclipse-workspace\\Buoi10-DocGhiFile\\Resource\\demoSauKhiDoiTen.txt"));
		
		File dir2 = new File("D:\\eclipse-workspace\\Buoi10-DocGhiFile\\Resource");
		File[] listFile = dir2.listFiles();
		for(File f : listFile) {
			System.out.println("File name: "+ f.getName());
		}
	}

}
