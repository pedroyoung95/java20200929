package chap18.lecture.dataInputRepeat;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class InputStreamEx {
	public static void main(String[] args) throws Exception {
		String path = "src\\chap18\\lecture\\dataInputRepeat\\InputStreamEx.java";
		FileInputStream is = new FileInputStream(path);
		
		int readInt;
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		
		System.out.println("------------------");
		
		while((readInt = is.read()) != -1) {
			System.out.print((char)readInt);
		}
		
		is.close();
	}
}
