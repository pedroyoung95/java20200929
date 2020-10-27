package chap18.textbook.s180405;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		
		Reader reader = new FileReader(src);
		Writer writer = new FileWriter(des, true);

//방법 1. 문자 한 개씩 읽은 걸 int 변수에 담고, 그 int변수를 출력
//		int rc;		
//		while((rc=reader.read()) != -1) {
//			writer.write(rc);
//		}
		
//방법 2. char배열에 읽은 걸 담고, 그 배열에 담긴 문자열을 출력
		char[] readChar = new char[100];
		while(reader.read(readChar) != -1) {
			writer.write(readChar);
		}
		
		
		
		reader.close();
		writer.close();
	}
}
