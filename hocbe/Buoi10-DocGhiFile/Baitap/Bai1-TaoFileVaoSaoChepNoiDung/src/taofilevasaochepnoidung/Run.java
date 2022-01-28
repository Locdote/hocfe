package taofilevasaochepnoidung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Run {

	public static void main(String[] args) throws IOException {
		File fileResource = new File("D:\\eclipse-workspace\\Bai1-TaoFileVaoSaoChepNoiDung\\Resource\\student.txt");

		try {
			fileResource.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Loi");
		}
		File fileClone = new File("D:\\eclipse-workspace\\Bai1-TaoFileVaoSaoChepNoiDung\\Resource\\student-clone.txt");
		try {
			fileClone.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		InputStream inStream = null;
		OutputStream outStream = null;

		try {
			inStream = new FileInputStream(
					new File("D:\\eclipse-workspace\\Bai1-TaoFileVaoSaoChepNoiDung\\Resource\\student.txt"));
			outStream = new FileOutputStream(
					new File("D:\\eclipse-workspace\\Bai1-TaoFileVaoSaoChepNoiDung\\Resource\\student-clone.txt"));

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
