//한글
package chap18.lecture.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class ReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/reader/ReaderEx1.java";
		Reader reader = new FileReader(path);
		
		int ch = reader.read();
		System.out.println(ch);
		System.out.println((char) ch);
		
		int ch2 = reader.read();
		int ch3 = reader.read();
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		reader.close();
		
		System.out.println("-------------------");
		//inputStream
		InputStream is = new FileInputStream(path);
		
		ch = is.read();
		ch2 = is.read();
		ch3 = is.read();
		System.out.println((char)ch);
		System.out.println((char)ch2);
		System.out.println((char)ch3); //한글은 1byte보다 크므로, inputStream의 read로는 읽을 수 없음
		
		
		is.close();
	}
}
