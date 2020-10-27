package chap18.lecture.dataOutputRepeat;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriterEx {
	public static void main(String[] args) throws Exception {
		String path1 = "src/chap18/lecture/dataOutputRepeat/WriterEx.java";
		Reader reader = new FileReader(path1);
		String path2 = "src/chap18/lecture/dataOutputRepeat/Test2.txt";
		Writer writer = new FileWriter(path2);
		
		writer.write("문자열을 파라미터로 받음\n");
		
		char[] arr = new char[6];
		arr[0] = '바';
		arr[1] = '이';
		arr[2] = '에';
		arr[3] = '른';
		arr[4] = '뮌';
		arr[5] = '휀';
		
		writer.write(arr);
		writer.write("\n");
		writer.write(arr, 4, 2);
		writer.write("\n");
		writer.write("바이에른 뮌헨");
		writer.write("\n");
		writer.write("이 문자열을 부분적으로 출력", 2, 4);
		
		writer.close();
	}
}
