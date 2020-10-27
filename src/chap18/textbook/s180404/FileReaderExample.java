package chap18.textbook.s180404;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		Reader fr = new FileReader("src/chap18/textbook/s180404/FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
//read(char[]): 배열 길이만큼의 글자수를 읽음
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		fr.close();
	}
}
