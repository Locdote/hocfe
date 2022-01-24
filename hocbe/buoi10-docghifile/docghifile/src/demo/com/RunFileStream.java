package demo.com;

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
		File file = new File("D:\\loc\\hocfe\\hocbe\\buoi10-docghifile\\docghifile\\resource\\noidung.txt");
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Nguyen Van Long\ndddddd");
			fileWriter.append('a');
			fileWriter.close();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("Loi khi mo file");
		}
	}
	
	public static void demoFileReader() {
		File file = new File("D:\\loc\\hocfe\\hocbe\\buoi10-docghifile\\docghifile\\resource\\noidung.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int c;
			while ((c = fileReader.read()) != -1) {
	            System.out.print(c);         
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
		} finally {
			try {
				fileReader.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
