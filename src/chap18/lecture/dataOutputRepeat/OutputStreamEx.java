package chap18.lecture.dataOutputRepeat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws Exception {
		String path1 = "src/chap18/lecture/dataOutputRepeat/OutputStreamEx.java";
		String path2 = "src/chap18/lecture/dataOutputRepeat/Test.txt";
		InputStream is = new FileInputStream(path1);
		OutputStream os = new FileOutputStream(path2);
		
		os.write(65);
		os.write(66);
		os.write('a');
		
		byte[] arr = new byte[5];
		arr[0] = 67;
		arr[1] = 68;
		arr[2] = 69;
		
		os.write(arr);
		os.write(arr, 1, 2);
//		한글
		int readChar;
		while((readChar = is.read()) != -1) {
			os.write(readChar);
		}
		os.close();
		is.close();
	}
}
