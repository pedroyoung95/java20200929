package chap18.lecture.filterstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/filterstream/01. 기본 타입과 참조 타입의 차이.png";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		long start = System.currentTimeMillis();
		while(bis.read() != -1) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("총 읽은 시간: " + (end-start) + "ms");
		fis.close();
		
		
	}
}
