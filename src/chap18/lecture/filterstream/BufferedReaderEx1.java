package chap18.lecture.filterstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src\\chap18\\lecture\\filterstream\\BufferedReaderEx1.java";
		Reader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		int oneChar = fr.read();
		String line = br.readLine();
//readLine(): \n 등으로 구분된 줄 단위의 문자열을 한 번에 읽음
		System.out.println((char)oneChar);
		System.out.println(line);
		
		br.close();
		fr.close();
	}
}
