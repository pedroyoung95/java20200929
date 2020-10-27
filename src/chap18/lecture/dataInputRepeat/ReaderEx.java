package chap18.lecture.dataInputRepeat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
	public static void main(String[] args) throws Exception {
		Reader fr = new FileReader("src\\chap18\\lecture\\inputstream\\InputStreamEx1.java");		
		
		System.out.println(fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		fr.close();
	}
}
