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
		String path = "src\\chap18\\lecture\\inputstream\\InputStreamEx1.java";
		FileInputStream is = new FileInputStream(path);
		
		int readInt = is.read(); 
		System.out.println(readInt);
//read()결과값을 변수에 넣는 과정에서 read가 실행됨. 이 다음부터는 2번째 글자부터 읽게 됨
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		is.close();
		
		
		
		
				
		BufferedInputStream bis = new BufferedInputStream(is);
		
		
		
		
		
		
	}
}
