package demo.docghifile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RunFileStream {

	public static void main(String[] args) {
		demoFileWriter();
		demoFileReader();

	}
	public static void demoFileWriter() {
		File file = new File("D:\\eclipse-workspace\\Buoi10-DocGhiFile\\Resource\\noidung.txt");
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Nguyen van lo");
			fileWriter.append("A");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("loi khi mo file");
		}
	}
	public static void demoFileReader() {
		File file = new File("D:\\eclipse-workspace\\Buoi10-DocGhiFile\\Resource\\noidung.txt");
		FileReader fileReader = null;
		try {
			 fileReader = new FileReader(file);
			int c;
			while ( (c = fileReader.read()) != -1) {
				System.out.print((char)c);
			}
			fileReader.close();
		} catch (IOException e) {
			try {
				fileReader.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
	
			}
			e.printStackTrace();
			
			
		}finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
