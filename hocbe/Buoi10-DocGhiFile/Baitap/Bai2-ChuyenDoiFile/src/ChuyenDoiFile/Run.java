package ChuyenDoiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Run {

	public static void main(String[] args) throws IOException {
		File fileResource = new File("D:\\eclipse-workspace\\Bai2-ChuyenDoiFile\\Resource\\name.txt");

		try {
			fileResource.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Loi");
		}
		File fileUppercase = new File("D:\\eclipse-workspace\\Bai2-ChuyenDoiFile\\Resource\\nameUpperCase.txt");

		try {
			fileUppercase.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Loi");
		}
		InputStream inStream = null;
		OutputStream outStream = null;
		
		

		try {
			inStream = new FileInputStream(new File("D:\\eclipse-workspace\\Bai2-ChuyenDoiFile\\Resource\\name.txt"));
			outStream = new FileOutputStream(
					new File("D:\\eclipse-workspace\\Bai2-ChuyenDoiFile\\Resource\\nameUpperCaseNewLine.txt"));

			int length;
			byte[] buffer = new byte[1024];

			while ((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}
			FileReader fileReader = null;
			fileReader = new FileReader(fileUppercase);
			int c;
			if( (c = fileReader.read()) == 10 ) {
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inStream.close();
			outStream.close();
		}
	}

}
