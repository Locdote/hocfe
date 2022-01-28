package taofilevasaochepnoidung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Run {
	
	public static final String DUONG_DAN_FILE = "D:\\loc\\hocfe\\hocbe\\buoi10-docghifile\\Baitap\\Bai1-TaoFileVaoSaoChepNoiDung\\Resource\\";

	public static void main(String[] args) throws IOException {
		
		File fileResource = new File(DUONG_DAN_FILE + "student.txt");

		try {
			fileResource.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Loi");
		}
		File fileClone = new File(DUONG_DAN_FILE + "student-clone.txt");
		try {
			fileClone.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		InputStream inStream = null;
		OutputStream outStream = null;

		try {
			inStream = new FileInputStream(
					new File(DUONG_DAN_FILE + "student.txt"));
			outStream = new FileOutputStream(
					new File(DUONG_DAN_FILE + "student-clone.txt"));

			int length;
			byte[] buffer = new byte[1024];

			while ((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inStream.close();
			outStream.close();
		}
	}

}
