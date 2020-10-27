package chap18.textbook.s180403;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFilename = "src/chap18/textbook/s180403/FileOutputStreamExample.java";
		String targetFileName = "copy.txt";
		
		FileInputStream fis = new FileInputStream(originalFilename);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != 1) {
			fos.write(readBytes, 0 ,readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
