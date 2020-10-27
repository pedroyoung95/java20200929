package chap18.lecture.dataInputRepeat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx {
	public static void main(String[] args) throws Exception {
		String path = "src\\chap18\\lecture\\inputstream\\InputStreamEx1.java";
		FileInputStream is = new FileInputStream(path);
		Reader isr = new InputStreamReader(is);
		
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());		
		isr.close();
	}
}
