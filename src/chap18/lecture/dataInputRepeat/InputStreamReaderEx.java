package chap18.lecture.dataInputRepeat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx {
	public static void main(String[] args) throws Exception {
		String path = "src\\chap18\\lecture\\dataInputRepeat\\InputStreamReaderEx.java";
		FileInputStream is = new FileInputStream(path);
		Reader isr = new InputStreamReader(is);
//Reader를 통해 한글 data 읽기 가능
		
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		
		System.out.println("------------------");
		
		int readStr;
		while((readStr = isr.read()) != -1) {
			System.out.print((char)readStr);
		}
		isr.close();
	}
}
