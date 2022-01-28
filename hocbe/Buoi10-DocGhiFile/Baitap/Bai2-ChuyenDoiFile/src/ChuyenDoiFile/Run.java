package ChuyenDoiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Run {

	public static final String DUONG_DAN_FILE = "D:\\loc\\hocfe\\hocbe\\buoi10-docghifile\\Baitap\\Bai2-ChuyenDoiFile\\Resource\\";
	
	public static void main(String[] args) throws IOException {
		File fileResource = new File(DUONG_DAN_FILE + "name.txt");

		try {
			fileResource.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Loi");
		}
		InputStream inStream = null;
		OutputStream outStream = null;
		
		

		try {
			inStream = new FileInputStream(new File(DUONG_DAN_FILE +  "name.txt"));
			outStream = new FileOutputStream(
					new File(DUONG_DAN_FILE + "nameUpperCaseNewLine.txt"));

			int i;
			boolean isNextUppercase = true;
			StringBuilder stringBuilder = new StringBuilder("");
			while ((i = inStream.read()) > -1) {
				
				char c = (char) i;
				String charStr = String.valueOf(c);
				if (isNextUppercase) {
					stringBuilder.append(charStr.toUpperCase());
					isNextUppercase = false;
				} else {
					stringBuilder.append(charStr);
				}
				if (i == 10)
					isNextUppercase = true;
			}
			
//			String result = stringBuilder.toString();
//			String firstChar = result.substring(0, 1);
//			String finalResult = firstChar.toUpperCase() + result.substring(1, result.length());
			
//			String result = stringBuilder.toString();
//			System.out.println(result.substring(2, 10));
			
			PrintWriter p = new PrintWriter(outStream);
			p.write(stringBuilder.toString());
			p.flush();
			p.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inStream.close();
			outStream.close();
		}
	}

}
