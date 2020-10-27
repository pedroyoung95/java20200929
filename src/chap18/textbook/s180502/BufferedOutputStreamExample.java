package chap18.textbook.s180502;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("src\\chap18\\lecture\\filterstream\\01. 기본 타입과 참조 타입의 차이.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("src\\chap18\\lecture\\filterstream\\Copy-01. 기본 타입과 참조 타입의 차이.png");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		
		fis = new FileInputStream("src\\chap18\\lecture\\filterstream\\01. 기본 타입과 참조 타입의 차이.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("src\\chap18\\lecture\\filterstream\\Copy-01. 기본 타입과 참조 타입의 차이.png");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		end = System.currentTimeMillis();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용했을 때: " + (end-start) + "ms");
		
		
	}
}
