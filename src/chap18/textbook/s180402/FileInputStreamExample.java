package chap18.textbook.s180402;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/chap18/textbook/s180402/FileInputStreamExample.java");
			
			int data;
			while((data = fis.read()) != -1) {
				System.out.write(data); //print((char)data)와 동일한 결과
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
