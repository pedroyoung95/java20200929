package chap18.lecture.dataOutputRepeat;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedOutputStreamEx {
	public static void main(String[] args) throws Exception {
		String path = "src\\chap18\\lecture\\dataOutputRepeat\\Bayern.jpg";
		String path2 = "src\\chap18\\lecture\\dataOutputRepeat\\Bayern-Copy.jpg";
		InputStream is = new FileInputStream(path);
		OutputStream os = new FileOutputStream(path2);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		long start = System.currentTimeMillis();
		
		int readCnt;
		while((readCnt = is.read()) != -1) {
			bos.write(readCnt);
		}
//		while((readCnt = is.read()) != -1) {
//			os.write(readCnt);
//		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("걸린 시간: " + (end-start) + "ms");
		bos.close();
	}
}
